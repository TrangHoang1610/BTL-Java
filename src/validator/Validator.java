/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Trang
 */
public class Validator {

    private String value;
    private String[] rules;
    private String field;
    private String text;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getRules() {
        return rules;
    }

    public void setRules(String[] rules) {
        this.rules = rules;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Validator(String value, String[] rules, String field) {
        this.value = value;
        this.rules = rules;
        this.field = field;
    }

    public Validator() {
    }

    public boolean required(String value) {
        if (!"".equals(value) && value != null) {
            return true;
        }
        return false;
    }

    public boolean isInteger(String value) {
        String regex = "^[0-9]*$";
        return Pattern.matches(regex, value);
    }

    public boolean isDecimal(String value) {
        String regex = "^[1-9][0-9]*(\\.[0-9]+)?$";
        return Pattern.matches(regex, value);
    }

    public boolean isString(String value) {
        String regex = "^[^0-9]*$";
        return Pattern.matches(regex, value);
    }

    public boolean isEmail(String value) {
        String regex = "^[a-z0-9](\\.?[a-z0-9])*@[a-z]{3,}\\.[a-z]{1,3}$";
        return Pattern.matches(regex, value);
    }

    public boolean validate(JFrame home) {
        boolean isSuccess = true;
        int size = rules.length;

        for (int i = 0; i < size; i++) {
            String rule = rules[i];
            switch (rule) {
                case "required":
                    if (!required(value)) {
                        isSuccess = false;
                        JOptionPane.showMessageDialog(home, field + " không được để trống");
                    }
                    break;
                case "isInteger":
                    if (!isInteger(value)) {
                        isSuccess = false;
                        JOptionPane.showMessageDialog(home, field + " phải là số");
                    }
                    break;
                case "isString":
                    if (!isString(value)) {
                        isSuccess = false;
                        JOptionPane.showMessageDialog(home, field + " phải là chữ");
                    }
                    break;
                case "isEmail":
                    if (!isEmail(value)) {
                        isSuccess = false;
                        JOptionPane.showMessageDialog(home, field + " không hợp lệ");
                    }
                    break;
                case "isDecimal":
                    if (!isDecimal(value)) {
                        isSuccess = false;
                        JOptionPane.showMessageDialog(home, field + " không hợp lệ");
                    }
                    break;
            }
        }

        return isSuccess;
    }

    public boolean setTextField(JFrame home) {
        if (validate(home)) {
            text = value;
            return true;
        }

        return false;
    }
}
