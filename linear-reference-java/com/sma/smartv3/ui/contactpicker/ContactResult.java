package com.sma.smartv3.ui.contactpicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ContactResult implements Parcelable {
    public static final Parcelable.Creator<ContactResult> CREATOR = null;
    private String mContactID;
    private String mDisplayName;
    private List<String> mEmails;
    private String mItemGroups;
    private List<PhoneNumber> mPhoneNumbers;
    private String mPhoto;
    private boolean mStarred;
    private String mThumbnail;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ContactResult(Contact contact) {
        this.mEmails = new ArrayList();
        this.mPhoneNumbers = new ArrayList();
        this.mItemGroups = "";
        this.mContactID = String.valueOf(contact.getId());
        this.mDisplayName = contact.getDisplayName();
        this.mStarred = contact.isStarred();
        this.mPhoto = String.valueOf(contact.getPhoto());
        this.mThumbnail = String.valueOf(contact.getThumbnail());
        this.mEmails.clear();
        this.mEmails.addAll(contact.getEmails());
        this.mPhoneNumbers.clear();
        this.mPhoneNumbers.addAll(contact.getPhoneNumbers());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContactID() {
        return this.mContactID;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public List<String> getEmails() {
        return this.mEmails;
    }

    public String getItemGroups() {
        return this.mItemGroups;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return this.mPhoneNumbers;
    }

    public String getPhoto() {
        return this.mPhoto;
    }

    public String getThumbnail() {
        return this.mThumbnail;
    }

    public boolean isStarred() {
        return this.mStarred;
    }

    public void setContactID(String mContactID) {
        this.mContactID = mContactID;
    }

    public void setDisplayName(String mDisplayName) {
        this.mDisplayName = mDisplayName;
    }

    public void setItemGroups(String itemGroups) {
        this.mItemGroups = itemGroups;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.mPhoneNumbers.get(0).setNumber(phoneNumber);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.mContactID);
        r1.writeString(this.mDisplayName);
        r1.writeByte(this.mStarred ? 1 : 0);
        r1.writeString(this.mPhoto);
        r1.writeString(this.mThumbnail);
        r1.writeStringList(this.mEmails);
        r1.writeTypedList(this.mPhoneNumbers);
    }

    public ContactResult(Parcel in) {
        this.mEmails = new ArrayList();
        this.mPhoneNumbers = new ArrayList();
        this.mItemGroups = "";
        this.mContactID = in.readString();
        this.mDisplayName = in.readString();
        if (in.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.mStarred = r0;
        this.mPhoto = in.readString();
        this.mThumbnail = in.readString();
        this.mEmails = in.createStringArrayList();
        in.readTypedList(this.mPhoneNumbers, PhoneNumber.CREATOR);
        return;
    L5:
        r0 = false;
        goto L6
    }
}
