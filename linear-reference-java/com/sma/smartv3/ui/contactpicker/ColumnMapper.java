package com.sma.smartv3.ui.contactpicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;

/* JADX INFO: loaded from: classes19.dex */
class ColumnMapper {
    private ColumnMapper() {
    }

    public static void mapDisplayName(Cursor cursor, Contact contact, int columnIndex) {
        String r0 = cursor.getString(columnIndex);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L9;
        contact.setDisplayName(r0);
        return;
    }

    public static void mapEmail(Cursor cursor, Contact contact, int columnIndex) {
        String r0 = cursor.getString(columnIndex);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.trim().isEmpty() == true) goto L9;
        contact.getEmails().add(r0);
        return;
    }

    public static void mapInVisibleGroup(Cursor cursor, Contact contact, int columnIndex) {
        contact.setInVisibleGroup(cursor.getInt(columnIndex));
    }

    public static void mapPhoneNumber(Context con, Cursor cursor, Contact contact, int noColumnIndex, int typeColIndex, int labelColIndex) {
        String r3 = cursor.getString(noColumnIndex);
        int r4 = cursor.getInt(typeColIndex);
        String r1 = cursor.getString(labelColIndex);
        String r0 = (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(con.getResources(), r4, r1);
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.isEmpty() == true) goto L9;
        String r2 = r3.replaceAll("\\s+", "");
        contact.getPhoneNumbers().add(new PhoneNumber(r0, r2.trim()));
        return;
    }

    public static void mapPhoto(Cursor cursor, Contact contact, int columnIndex) {
        String r0 = cursor.getString(columnIndex);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L9;
        contact.setPhoto(Uri.parse(r0));
        return;
    }

    public static void mapStarred(Cursor cursor, Contact contact, int columnIndex) {
        if (cursor.getInt(columnIndex) == 0) goto L5;
        boolean r0 = true;
    L6:
        contact.setStarred(r0);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static void mapThumbnail(Cursor cursor, Contact contact, int columnIndex) {
        String r0 = cursor.getString(columnIndex);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L9;
        contact.setThumbnail(Uri.parse(r0));
        return;
    }
}
