package vn.ted.pdf.model;

public class ListCustomers {
    private int customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_company_name;
    private String date_valid;
    private String customer_account_never_expires;
    private int number_of_licenses_available;
    private boolean account_active;
    private boolean customer_has_registered;
    private boolean web_viewer_enabled;

    public ListCustomers() {
    }

    public ListCustomers(int customer_id, String customer_name, String customer_email, String customer_company_name, String date_valid, String customer_account_never_expires, int number_of_licenses_available, boolean account_active, boolean customer_has_registered, boolean web_viewer_enabled) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_company_name = customer_company_name;
        this.date_valid = date_valid;
        this.customer_account_never_expires = customer_account_never_expires;
        this.number_of_licenses_available = number_of_licenses_available;
        this.account_active = account_active;
        this.customer_has_registered = customer_has_registered;
        this.web_viewer_enabled = web_viewer_enabled;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_company_name() {
        return customer_company_name;
    }

    public void setCustomer_company_name(String customer_company_name) {
        this.customer_company_name = customer_company_name;
    }

    public String getDate_valid() {
        return date_valid;
    }

    public void setDate_valid(String date_valid) {
        this.date_valid = date_valid;
    }

    public String getCustomer_account_never_expires() {
        return customer_account_never_expires;
    }

    public void setCustomer_account_never_expires(String customer_account_never_expires) {
        this.customer_account_never_expires = customer_account_never_expires;
    }

    public int getNumber_of_licenses_available() {
        return number_of_licenses_available;
    }

    public void setNumber_of_licenses_available(int number_of_licenses_available) {
        this.number_of_licenses_available = number_of_licenses_available;
    }

    public boolean isAccount_active() {
        return account_active;
    }

    public void setAccount_active(boolean account_active) {
        this.account_active = account_active;
    }

    public boolean isCustomer_has_registered() {
        return customer_has_registered;
    }

    public void setCustomer_has_registered(boolean customer_has_registered) {
        this.customer_has_registered = customer_has_registered;
    }

    public boolean isWeb_viewer_enabled() {
        return web_viewer_enabled;
    }

    public void setWeb_viewer_enabled(boolean web_viewer_enabled) {
        this.web_viewer_enabled = web_viewer_enabled;
    }
}
