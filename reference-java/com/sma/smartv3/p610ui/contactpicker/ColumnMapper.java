package com.sma.smartv3.p610ui.contactpicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;

/* JADX INFO: loaded from: classes19.dex */
class ColumnMapper {
    private ColumnMapper() {
    }

    public static void mapDisplayName(Cursor cursor, Contact contact, int columnIndex) {
        String string = cursor.getString(columnIndex);
        if (string == null || string.isEmpty()) {
            return;
        }
        contact.setDisplayName(string);
    }

    public static void mapEmail(Cursor cursor, Contact contact, int columnIndex) {
        String string = cursor.getString(columnIndex);
        if (string == null || string.trim().isEmpty()) {
            return;
        }
        contact.getEmails().add(string);
    }

    public static void mapInVisibleGroup(Cursor cursor, Contact contact, int columnIndex) {
        contact.setInVisibleGroup(cursor.getInt(columnIndex));
    }

    public static void mapPhoneNumber(Context con, Cursor cursor, Contact contact, int noColumnIndex, int typeColIndex, int labelColIndex) {
        String string = cursor.getString(noColumnIndex);
        String str = (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(con.getResources(), cursor.getInt(typeColIndex), cursor.getString(labelColIndex));
        if (string == null || string.isEmpty()) {
            return;
        }
        contact.getPhoneNumbers().add(new PhoneNumber(str, string.replaceAll("\\s+", "").trim()));
    }

    public static void mapPhoto(Cursor cursor, Contact contact, int columnIndex) {
        String string = cursor.getString(columnIndex);
        if (string == null || string.isEmpty()) {
            return;
        }
        contact.setPhoto(Uri.parse(string));
    }

    public static void mapStarred(Cursor cursor, Contact contact, int columnIndex) {
        contact.setStarred(cursor.getInt(columnIndex) != 0);
    }

    public static void mapThumbnail(Cursor cursor, Contact contact, int columnIndex) {
        String string = cursor.getString(columnIndex);
        if (string == null || string.isEmpty()) {
            return;
        }
        contact.setThumbnail(Uri.parse(string));
    }
}
