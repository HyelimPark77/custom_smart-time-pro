package com.sma.smartv3.ui.contactpicker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ContactHelper {
    public static final int CONTACT_PICKER_REQUEST = 991;
    private static final String DISPLAY_NAME = null;
    private static final Uri EMAIL_CONTENT_URI = null;
    private static final String[] EMAIL_PROJECTION = null;
    private static final String[] NUMBER_PROJECTION = null;
    private static final Uri PHONE_CONTENT_URI = null;
    private static final String[] PROJECTION = null;
    private boolean cancelLoad;
    private Context mContext;
    private ContentResolver mResolver;
    private Cursor phoneCursor;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.contactpicker.ContactHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn = null;

        static {
            int[] r0 = new int[LimitColumn.values().length];
            $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn = r0;
            r0[LimitColumn.EMAIL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[LimitColumn.PHONE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[LimitColumn.NONE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    static {
        DISPLAY_NAME = "display_name";
        PHONE_CONTENT_URI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        EMAIL_CONTENT_URI = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        PROJECTION = new String[]{"_id", "in_visible_group", "display_name", "starred", "photo_uri", "photo_thumb_uri", "has_phone_number"};
        EMAIL_PROJECTION = new String[]{"contact_id", "data1"};
        NUMBER_PROJECTION = new String[]{"contact_id", "data1", "data2", "data3"};
    }

    public ContactHelper(@NonNull Context context) {
        this.cancelLoad = false;
        this.mContext = context;
        this.mResolver = context.getContentResolver();
    }

    private Cursor createCursor(String filter) {
        return this.mResolver.query(ContactsContract.Contacts.CONTENT_URI, PROJECTION, filter, null, DISPLAY_NAME);
    }

    private HashMap<Long, List<PhoneNumber>> getAllPhoneNumber() {
        HashMap<Long, List<PhoneNumber>> r0 = new HashMap();
        if (this.phoneCursor != null) goto L14;
        this.phoneCursor = this.mResolver.query(PHONE_CONTENT_URI, NUMBER_PROJECTION, null, null, null);
    L6:
        if (this.phoneCursor.moveToNext() == false) goto L14;
        Cursor r1 = this.phoneCursor;
        Long r2 = Long.valueOf(r1.getLong(r1.getColumnIndex("contact_id")));
        Cursor r3 = this.phoneCursor;
        String r4 = r3.getString(r3.getColumnIndex("data1"));
        Cursor r5 = this.phoneCursor;
        int r6 = r5.getInt(r5.getColumnIndex("data2"));
        Cursor r7 = this.phoneCursor;
        String r8 = (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.mContext.getResources(), r6, r7.getString(r7.getColumnIndex("data3")));
        List<PhoneNumber> r9 = r0.get(r2);
        if (r9 != null) goto L10;
        r9 = new ArrayList();
        r0.put(r2, r9);
    L10:
        if (r4 == null) goto L6;
        if (r4.isEmpty() == true) goto L6;
        r9.add(new PhoneNumber(r8, r4.replaceAll("\\s+", "").trim()));
    L14:
        LogUtils.d(new Object[]{"phoneNumbers size = " + r0.size()});
        return r0;
    }

    private void getEmail(long id, Contact contact) {
        Cursor r7 = this.mResolver.query(EMAIL_CONTENT_URI, EMAIL_PROJECTION, "contact_id = ?", new String[]{String.valueOf(id)}, null);
        if (r7 == null) goto L9;
        int r8 = r7.getColumnIndex("data1");
        if (r7.moveToFirst() == false) goto L7;
        ColumnMapper.mapEmail(r7, contact, r8);
    L7:
        r7.close();
        return;
    }

    private String getFilter(LimitColumn limitColumn) {
        if (AnonymousClass1.$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[limitColumn.ordinal()] == 2) goto L6;
        return null;
    L6:
        return "has_phone_number > 0";
    }

    private void getPhoneNumber(long id, Cursor cursor, Contact contact, int hasPhoneNumberColumnIndex, HashMap<Long, List<PhoneNumber>> phoneNumbers) {
        if (Integer.parseInt(cursor.getString(hasPhoneNumberColumnIndex)) <= 0) goto L10;
        List<PhoneNumber> r1 = phoneNumbers.get(Long.valueOf(id));
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.size() <= 0) goto L12;
        contact.getPhoneNumbers().clear();
        contact.getPhoneNumbers().addAll(r1);
        return;
    L12:
        return;
    }

    public void load(LimitColumn columnLimitChoice, LoadCallBack callBack) {
        ContactHelper r0 = this;
        long r8 = System.currentTimeMillis();
        HashMap<Long, List<PhoneNumber>> r6 = r0.getAllPhoneNumber();
        LongSparseArray r10 = new LongSparseArray();
        Cursor r3 = r0.createCursor(getFilter(columnLimitChoice));
        r3.moveToFirst();
        int r11 = r3.getColumnIndex("_id");
        int r12 = r3.getColumnIndex("in_visible_group");
        int r13 = r3.getColumnIndex(DISPLAY_NAME);
        int r14 = r3.getColumnIndex("starred");
        int r15 = r3.getColumnIndex("photo_uri");
        int r1 = r3.getColumnIndex("photo_thumb_uri");
        int r5 = r3.getColumnIndex("has_phone_number");
    L4:
        if (r3.isAfterLast() == true) goto L27;
        if (r0.cancelLoad == true) goto L27;
        int r2 = r5;
        HashMap<Long, List<PhoneNumber>> r16 = r6;
        long r7 = r3.getLong(r11);
        Contact r4 = (Contact) r10.get(r7, null);
        if (r4 != null) goto L10;
        r4 = new Contact(r7);
    L10:
        ColumnMapper.mapInVisibleGroup(r3, r4, r12);
        ColumnMapper.mapDisplayName(r3, r4, r13);
        ColumnMapper.mapStarred(r3, r4, r14);
        ColumnMapper.mapPhoto(r3, r4, r15);
        ColumnMapper.mapThumbnail(r3, r4, r1);
        int r19 = r1;
        int r9 = AnonymousClass1.$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[columnLimitChoice.ordinal()];
        if (r9 != 1) goto L13;
        long r17 = r7;
        r5 = r2;
        r0.getEmail(r17, r4);
    L20:
        Cursor r18 = r3;
        if (columnLimitChoice == LimitColumn.EMAIL) goto L23;
        r10.put(r17, r4);
        callBack.onNext(r4);
    L26:
        r18.moveToNext();
        r6 = r16;
        r3 = r18;
        r1 = r19;
        goto L4
    L23:
        if (r4.getEmails().size() <= 0) goto L26;
        r10.put(r17, r4);
        callBack.onNext(r4);
        goto L26
    L13:
        if (r9 != 2) goto L15;
        r17 = r7;
        r5 = r2;
        r0.getPhoneNumber(r17, r3, r4, r5, r16);
        goto L20
    L15:
        if (r9 == 3) goto L17;
        r17 = r7;
        r5 = r2;
        goto L20
    L17:
        r0.getEmail(r7, r4);
        r17 = r7;
        r5 = r2;
        r0.getPhoneNumber(r17, r3, r4, r5);
        r0 = this;
    L27:
        r3.close();
        Cursor r20 = r0.phoneCursor;
        if (r20 == null) goto L30;
        r20.close();
        r0.phoneCursor = null;
    L30:
        LogUtils.d(new Object[]{"加载完成，耗时：" + (System.currentTimeMillis() - r8) + "ms"});
    }

    public void setCancelLoad(boolean cancel) {
        this.cancelLoad = cancel;
    }

    @Deprecated
    private void getPhoneNumber(long id, Cursor cursor, Contact contact, int hasPhoneNumberColumnIndex) {
        if (Integer.parseInt(cursor.getString(hasPhoneNumberColumnIndex)) <= 0) goto L13;
        Cursor r8 = this.mResolver.query(PHONE_CONTENT_URI, NUMBER_PROJECTION, "contact_id = ?", new String[]{String.valueOf(id)}, null);
        if (r8 == null) goto L14;
        r8.moveToFirst();
        int r10 = r8.getColumnIndex("data1");
        int r11 = r8.getColumnIndex("data2");
        int r12 = r8.getColumnIndex("data3");
    L8:
        if (r8.isAfterLast() == true) goto L10;
        ColumnMapper.mapPhoneNumber(this.mContext, r8, contact, r10, r11, r12);
        r8.moveToNext();
        goto L8
    L10:
        r8.close();
        return;
    L14:
        return;
    }
}
