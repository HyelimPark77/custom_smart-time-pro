package com.sma.smartv3.ui.contactpicker;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class Contact implements Comparable<Contact> {
    private int backgroundColor;
    private boolean isSelected;
    private String mDisplayName;
    private List<String> mEmails;
    private final long mId;
    private int mInVisibleGroup;
    private List<PhoneNumber> mPhoneNumbers;
    private Uri mPhoto;
    private boolean mStarred;
    private Uri mThumbnail;

    public Contact(long id) {
        this.mEmails = new ArrayList();
        this.mPhoneNumbers = new ArrayList();
        this.backgroundColor = -16776961;
        this.mId = id;
        this.backgroundColor = ColorUtils.getRandomMaterialColor();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Contact other) {
        return compareTo2(other);
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if (o != null) goto L8;
    L13:
        return false;
    L8:
        if (getClass() != o.getClass()) goto L13;
        if (this.mId != ((Contact) o).mId) goto L13;
        return true;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public List<String> getEmails() {
        return this.mEmails;
    }

    public long getId() {
        return this.mId;
    }

    public int getInVisibleGroup() {
        return this.mInVisibleGroup;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return this.mPhoneNumbers;
    }

    public Uri getPhoto() {
        return this.mPhoto;
    }

    public Uri getThumbnail() {
        return this.mThumbnail;
    }

    public int hashCode() {
        long r0 = this.mId;
        return (int) (r0 ^ (r0 >>> 32));
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isStarred() {
        return this.mStarred;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setDisplayName(String displayName) {
        this.mDisplayName = displayName;
    }

    public void setEmails(List<String> emails) {
        this.mEmails = emails;
    }

    public void setInVisibleGroup(int inVisibleGroup) {
        this.mInVisibleGroup = inVisibleGroup;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.mPhoneNumbers = phoneNumbers;
    }

    public void setPhoto(Uri photo) {
        this.mPhoto = photo;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public void setStarred(boolean starred) {
        this.mStarred = starred;
    }

    public void setThumbnail(Uri thumbnail) {
        this.mThumbnail = thumbnail;
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Contact other) {
        String r0 = this.mDisplayName;
        if (r0 == null) goto L8;
        String r2 = other.mDisplayName;
        if (r2 != null) goto L7;
        return -1;
    L7:
        return r0.compareTo(r2);
    L8:
        return -1;
    }
}
