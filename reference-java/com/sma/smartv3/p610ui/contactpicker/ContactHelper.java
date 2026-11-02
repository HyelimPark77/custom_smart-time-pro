package com.sma.smartv3.p610ui.contactpicker;

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
    private boolean cancelLoad = false;
    private Context mContext;
    private ContentResolver mResolver;
    private Cursor phoneCursor;
    private static final String DISPLAY_NAME = "display_name";
    private static final Uri PHONE_CONTENT_URI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
    private static final Uri EMAIL_CONTENT_URI = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
    private static final String[] PROJECTION = {"_id", "in_visible_group", "display_name", "starred", "photo_uri", "photo_thumb_uri", "has_phone_number"};
    private static final String[] EMAIL_PROJECTION = {"contact_id", "data1"};
    private static final String[] NUMBER_PROJECTION = {"contact_id", "data1", "data2", "data3"};

    /* JADX INFO: renamed from: com.sma.smartv3.ui.contactpicker.ContactHelper$1 */
    public static /* synthetic */ class C186601 {
        static final /* synthetic */ int[] $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn;

        static {
            int[] iArr = new int[LimitColumn.values().length];
            $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn = iArr;
            try {
                iArr[LimitColumn.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[LimitColumn.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[LimitColumn.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ContactHelper(@NonNull Context context) {
        this.mContext = context;
        this.mResolver = context.getContentResolver();
    }

    private Cursor createCursor(String filter) {
        return this.mResolver.query(ContactsContract.Contacts.CONTENT_URI, PROJECTION, filter, null, DISPLAY_NAME);
    }

    private HashMap<Long, List<PhoneNumber>> getAllPhoneNumber() {
        HashMap<Long, List<PhoneNumber>> map = new HashMap<>();
        if (this.phoneCursor == null) {
            this.phoneCursor = this.mResolver.query(PHONE_CONTENT_URI, NUMBER_PROJECTION, null, null, null);
            while (this.phoneCursor.moveToNext()) {
                Cursor cursor = this.phoneCursor;
                Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("contact_id")));
                Cursor cursor2 = this.phoneCursor;
                String string = cursor2.getString(cursor2.getColumnIndex("data1"));
                Cursor cursor3 = this.phoneCursor;
                int i = cursor3.getInt(cursor3.getColumnIndex("data2"));
                Cursor cursor4 = this.phoneCursor;
                String str = (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.mContext.getResources(), i, cursor4.getString(cursor4.getColumnIndex("data3")));
                List<PhoneNumber> arrayList = map.get(lValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(lValueOf, arrayList);
                }
                if (string != null && !string.isEmpty()) {
                    arrayList.add(new PhoneNumber(str, string.replaceAll("\\s+", "").trim()));
                }
            }
        }
        LogUtils.m11128d("phoneNumbers size = " + map.size());
        return map;
    }

    private void getEmail(long id, Contact contact) {
        Cursor cursorQuery = this.mResolver.query(EMAIL_CONTENT_URI, EMAIL_PROJECTION, "contact_id = ?", new String[]{String.valueOf(id)}, null);
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex("data1");
            if (cursorQuery.moveToFirst()) {
                ColumnMapper.mapEmail(cursorQuery, contact, columnIndex);
            }
            cursorQuery.close();
        }
    }

    private String getFilter(LimitColumn limitColumn) {
        if (C186601.$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[limitColumn.ordinal()] != 2) {
            return null;
        }
        return "has_phone_number > 0";
    }

    private void getPhoneNumber(long id, Cursor cursor, Contact contact, int hasPhoneNumberColumnIndex, HashMap<Long, List<PhoneNumber>> phoneNumbers) {
        List<PhoneNumber> list;
        if (Integer.parseInt(cursor.getString(hasPhoneNumberColumnIndex)) <= 0 || (list = phoneNumbers.get(Long.valueOf(id))) == null || list.size() <= 0) {
            return;
        }
        contact.getPhoneNumbers().clear();
        contact.getPhoneNumbers().addAll(list);
    }

    public void load(LimitColumn columnLimitChoice, LoadCallBack callBack) {
        long j;
        ContactHelper contactHelper = this;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<Long, List<PhoneNumber>> allPhoneNumber = contactHelper.getAllPhoneNumber();
        LongSparseArray longSparseArray = new LongSparseArray();
        Cursor cursorCreateCursor = contactHelper.createCursor(getFilter(columnLimitChoice));
        cursorCreateCursor.moveToFirst();
        int columnIndex = cursorCreateCursor.getColumnIndex("_id");
        int columnIndex2 = cursorCreateCursor.getColumnIndex("in_visible_group");
        int columnIndex3 = cursorCreateCursor.getColumnIndex(DISPLAY_NAME);
        int columnIndex4 = cursorCreateCursor.getColumnIndex("starred");
        int columnIndex5 = cursorCreateCursor.getColumnIndex("photo_uri");
        int columnIndex6 = cursorCreateCursor.getColumnIndex("photo_thumb_uri");
        int columnIndex7 = cursorCreateCursor.getColumnIndex("has_phone_number");
        while (!cursorCreateCursor.isAfterLast() && !contactHelper.cancelLoad) {
            int i = columnIndex7;
            HashMap<Long, List<PhoneNumber>> map = allPhoneNumber;
            long j2 = cursorCreateCursor.getLong(columnIndex);
            Contact contact = (Contact) longSparseArray.get(j2, null);
            if (contact == null) {
                contact = new Contact(j2);
            }
            ColumnMapper.mapInVisibleGroup(cursorCreateCursor, contact, columnIndex2);
            ColumnMapper.mapDisplayName(cursorCreateCursor, contact, columnIndex3);
            ColumnMapper.mapStarred(cursorCreateCursor, contact, columnIndex4);
            ColumnMapper.mapPhoto(cursorCreateCursor, contact, columnIndex5);
            ColumnMapper.mapThumbnail(cursorCreateCursor, contact, columnIndex6);
            int i2 = columnIndex6;
            int i3 = C186601.$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn[columnLimitChoice.ordinal()];
            if (i3 == 1) {
                j = j2;
                columnIndex7 = i;
                contactHelper.getEmail(j, contact);
            } else if (i3 == 2) {
                j = j2;
                columnIndex7 = i;
                contactHelper.getPhoneNumber(j, cursorCreateCursor, contact, columnIndex7, map);
            } else if (i3 != 3) {
                j = j2;
                columnIndex7 = i;
            } else {
                contactHelper.getEmail(j2, contact);
                j = j2;
                columnIndex7 = i;
                contactHelper.getPhoneNumber(j, cursorCreateCursor, contact, columnIndex7);
                contactHelper = this;
            }
            Cursor cursor = cursorCreateCursor;
            if (columnLimitChoice != LimitColumn.EMAIL) {
                longSparseArray.put(j, contact);
                callBack.onNext(contact);
            } else if (contact.getEmails().size() > 0) {
                longSparseArray.put(j, contact);
                callBack.onNext(contact);
            }
            cursor.moveToNext();
            allPhoneNumber = map;
            cursorCreateCursor = cursor;
            columnIndex6 = i2;
        }
        cursorCreateCursor.close();
        Cursor cursor2 = contactHelper.phoneCursor;
        if (cursor2 != null) {
            cursor2.close();
            contactHelper.phoneCursor = null;
        }
        LogUtils.m11128d("加载完成，耗时：" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    public void setCancelLoad(boolean cancel) {
        this.cancelLoad = cancel;
    }

    @Deprecated
    private void getPhoneNumber(long id, Cursor cursor, Contact contact, int hasPhoneNumberColumnIndex) {
        Cursor cursorQuery;
        if (Integer.parseInt(cursor.getString(hasPhoneNumberColumnIndex)) <= 0 || (cursorQuery = this.mResolver.query(PHONE_CONTENT_URI, NUMBER_PROJECTION, "contact_id = ?", new String[]{String.valueOf(id)}, null)) == null) {
            return;
        }
        cursorQuery.moveToFirst();
        int columnIndex = cursorQuery.getColumnIndex("data1");
        int columnIndex2 = cursorQuery.getColumnIndex("data2");
        int columnIndex3 = cursorQuery.getColumnIndex("data3");
        while (!cursorQuery.isAfterLast()) {
            ColumnMapper.mapPhoneNumber(this.mContext, cursorQuery, contact, columnIndex, columnIndex2, columnIndex3);
            cursorQuery.moveToNext();
        }
        cursorQuery.close();
    }
}
