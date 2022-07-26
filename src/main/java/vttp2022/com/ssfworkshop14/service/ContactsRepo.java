package vttp2022.com.ssfworkshop14.service;

import vttp2022.com.ssfworkshop14.model.Contact;

public interface ContactsRepo {

    public void save(final Contact ctc);
    public Contact findById(final String contactId);
    
}
