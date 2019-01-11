package vn.ted.pdf.command;

import vn.ted.pdf.IF.Customer;

public class UserCommand implements Customer {

    @Override
    public void insert() {
        /*
        Example 1: Limited account access and publication access
Create a customer account valid from 1st April 2016 to 1st May 2016 and grant
them access to 2 publications (ids 100 and 101):
https://www.website.com/Interop.php?un=<replace with publisher
username>&pw=<replace with publisher
password>&action=add_customer&name=John%20Doe&email=johndoe@yaho
o.com&start_date=04-01-2016&end_type=date&end_date=05-01-
2016&publication=100,101&licenses=1
The customer first name and surname, in this example John Doe, can either be
separated by a space or %20. Both are accepted by the administration system.
If using CURL you need to use %%20.
Example 2: No expiry
Create a customer account valid from 04-01-2016 that does not expire:
https://www.website.com/Interop.php?un=<replace with publisher
username>&pw=<replace with publisher
password>&action=add_customer&name=John%20Doe&email=johndoe@yaho
o.com&start_date=04-01-2016&end_type=unlimited&licenses=1
Example output:
OK
"13498"Safeguard Ecommerce API - Revision 1.17 2017 Locklizard Ltd Page | 33 of 89
Example 3: No expiry with Web Viewer access
Create a customer account valid from 04-01-2016 that does not expire and has
Web Viewer access:
https://www.website.com/Interop.php?un=<replace with publisher
username>&pw=<replace with publisher
password>&action=add_customer&name=John%20Doe&email=johndoe@yaho
o.com&start_date=04-01-
2016&end_type=unlimited&licenses=1&webviewer=1
         */
    }

    @Override
    public void update() {

    }

    public void updatePassword(int id, String password) {

    }

    @Override
    public void detete() {

    }
}
