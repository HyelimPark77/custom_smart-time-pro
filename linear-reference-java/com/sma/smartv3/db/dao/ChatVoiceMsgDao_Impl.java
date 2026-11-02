package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.OOXX1;
import com.android.mltcode.paycertificationapi.X10O00Oi;
import com.android.mltcode.paycertificationapi.XOIIXI1I;
import com.ironsource.C2985d4;
import com.sma.smartv3.db.converter.ChatAiModeConverter;
import com.sma.smartv3.db.converter.ChatShowTypeConverter;
import com.sma.smartv3.db.converter.FunctionTypeConverter;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.dto.ChatAiMode;
import com.sma.smartv3.dto.FunctionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatVoiceMsgDao_Impl implements ChatVoiceMsgDao {
    private final ChatAiModeConverter __chatAiModeConverter;
    private final ChatShowTypeConverter __chatShowTypeConverter;
    private final RoomDatabase __db;
    private final FunctionTypeConverter __functionTypeConverter;
    private final EntityInsertAdapter<ChatVoiceAssistantMessage> __insertAdapterOfChatVoiceAssistantMessage;

    /* JADX INFO: renamed from: com.sma.smartv3.db.dao.ChatVoiceMsgDao_Impl$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$sma$smartv3$dto$FunctionType = null;

        static {
            int[] r0 = new int[FunctionType.values().length];
            $SwitchMap$com$sma$smartv3$dto$FunctionType = r0;
            r0[FunctionType.THIRD_PARTY_AI_ASSISTANT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            return;
        }
    }

    public ChatVoiceMsgDao_Impl(@NonNull final RoomDatabase __db) {
        this.__functionTypeConverter = new FunctionTypeConverter();
        this.__chatAiModeConverter = new ChatAiModeConverter();
        this.__chatShowTypeConverter = new ChatShowTypeConverter();
        this.__db = __db;
        this.__insertAdapterOfChatVoiceAssistantMessage = new AnonymousClass1(this);
    }

    public static /* bridge */ /* synthetic */ FunctionTypeConverter IiI10X(ChatVoiceMsgDao_Impl r0) {
        return r0.__functionTypeConverter;
    }

    public static /* bridge */ /* synthetic */ ChatShowTypeConverter O00(ChatVoiceMsgDao_Impl r0) {
        return r0.__chatShowTypeConverter;
    }

    public static /* synthetic */ Integer OXO1(ChatVoiceMsgDao_Impl r1, FunctionType r2, SQLiteConnection r3) {
        r1.getClass();
        SQLiteStatement r0 = r3.prepare("delete from chatvoiceassistantmessage where type =?");
        r0.mo3340bindText(1, r1.__FunctionType_enumToString(r2));     // Catch: Throwable -> L6
        r0.step();     // Catch: Throwable -> L6
        Integer r4 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(r3));     // Catch: Throwable -> L6
        r0.close();
        return r4;
    L6:
        th = move-exception;
        r0.close();
        throw th;
    }

    public static /* synthetic */ Long XIi00iiXO(ChatVoiceMsgDao_Impl r0, ChatVoiceAssistantMessage r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfChatVoiceAssistantMessage.insertAndReturnId(r2, r1));
    }

    public static /* bridge */ /* synthetic */ ChatAiModeConverter XO0O10(ChatVoiceMsgDao_Impl r0) {
        return r0.__chatAiModeConverter;
    }

    private String __FunctionType_enumToString(@NonNull final FunctionType _value) {
        if (AnonymousClass2.$SwitchMap$com$sma$smartv3$dto$FunctionType[_value.ordinal()] != 1) goto L7;
        return "THIRD_PARTY_AI_ASSISTANT";
    L7:
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(ChatVoiceMsgDao_Impl r18, FunctionType r19, SQLiteConnection r20) {
        r18.getClass();
        SQLiteStatement r1 = r20.prepare("select * from chatvoiceassistantmessage where type = ?");
        r1.mo3340bindText(1, r18.__FunctionType_enumToString(r19));     // Catch: Throwable -> L24
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "id");     // Catch: Throwable -> L24
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "data");     // Catch: Throwable -> L24
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "type");     // Catch: Throwable -> L24
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "aiMode");     // Catch: Throwable -> L24
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, C2985d4.i.g0);     // Catch: Throwable -> L24
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "showType");     // Catch: Throwable -> L24
        ArrayList r8 = new ArrayList();     // Catch: Throwable -> L24
    L4:
        if (r1.step() == false) goto L26;
        int r12 = (int) r1.getLong(r2);     // Catch: Throwable -> L24
        if (r1.isNull(r3) == false) goto L9;
        String r13 = null;
    L11:
        if (r1.isNull(r4) == false) goto L13;
        String r9 = null;
    L14:
        FunctionType r14 = r18.__functionTypeConverter.toFunctionType(r9);     // Catch: Throwable -> L24
        if (r1.isNull(r5) == false) goto L17;
        String r10 = null;
    L18:
        ChatAiMode r15 = r18.__chatAiModeConverter.toAiMode(r10);     // Catch: Throwable -> L24
        int r11 = (int) r1.getLong(r6);     // Catch: Throwable -> L24
        if (r1.isNull(r7) == false) goto L21;
        String r16 = null;
    L22:
        r8.add(new ChatVoiceAssistantMessage(r12, r13, r14, r15, r11, r18.__chatShowTypeConverter.toShowType(r16)));     // Catch: Throwable -> L24
        goto L4
    L21:
        r16 = r1.getText(r7);     // Catch: Throwable -> L24
        goto L22
    L17:
        r10 = r1.getText(r5);     // Catch: Throwable -> L24
        goto L18
    L13:
        r9 = r1.getText(r4);     // Catch: Throwable -> L24
        goto L14
    L9:
        r13 = r1.getText(r3);     // Catch: Throwable -> L24
        goto L11
    L26:
        r1.close();
        return r8;
    L24:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.ChatVoiceMsgDao
    public long addChatVoice(final ChatVoiceAssistantMessage item) {
        item.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new XOIIXI1I(this, item))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.ChatVoiceMsgDao
    public int deleteByType(final FunctionType functionType) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new X10O00Oi(this, functionType))).intValue();
    }

    @Override // com.sma.smartv3.db.dao.ChatVoiceMsgDao
    public List<ChatVoiceAssistantMessage> queryAllChatVoiceMessage(final FunctionType functionType) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new OOXX1(this, functionType));
    }
}
