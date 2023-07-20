package ru.gb.FINAL.final_famliy_tree.Model;


    public class ContactInfo {
        private String contactType;
        private String contactInfo;

        public ContactInfo(String contactType, String contactInfo) {
            this.contactType = contactType;
            this.contactInfo = contactInfo;
        }

        public String getContactType() {
            return contactType;
        }

        public String getContactInfo() {
            return contactInfo;
        }

        @Override
        public String toString() {
            return contactType + ": " + contactInfo;
        }
    }
