package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.ironsource.C12616d4;
import com.sma.smartv3.dto.FunctionType;
import com.sma.smartv3.p608db.converter.ChatAiModeConverter;
import com.sma.smartv3.p608db.converter.ChatShowTypeConverter;
import com.sma.smartv3.p608db.converter.FunctionTypeConverter;
import com.sma.smartv3.p608db.dao.ChatVoiceMsgDao_Impl;
import com.sma.smartv3.p608db.entity.ChatVoiceAssistantMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatVoiceMsgDao_Impl implements ChatVoiceMsgDao {
    private final RoomDatabase __db;
    private final FunctionTypeConverter __functionTypeConverter = new FunctionTypeConverter();
    private final ChatAiModeConverter __chatAiModeConverter = new ChatAiModeConverter();
    private final ChatShowTypeConverter __chatShowTypeConverter = new ChatShowTypeConverter();
    private final EntityInsertAdapter<ChatVoiceAssistantMessage> __insertAdapterOfChatVoiceAssistantMessage = new EntityInsertAdapter<ChatVoiceAssistantMessage>() { // from class: com.sma.smartv3.db.dao.ChatVoiceMsgDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `ChatVoiceAssistantMessage` (`id`,`data`,`type`,`aiMode`,`ended`,`showType`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final ChatVoiceAssistantMessage entity) {
            statement.mo47599bindLong(1, entity.getId());
            if (entity.getData() == null) {
                statement.mo47600bindNull(2);
            } else {
                statement.mo47601bindText(2, entity.getData());
            }
            String strFromFunctionType = ChatVoiceMsgDao_Impl.this.__functionTypeConverter.fromFunctionType(entity.getType());
            if (strFromFunctionType == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, strFromFunctionType);
            }
            String strFromAiMode = ChatVoiceMsgDao_Impl.this.__chatAiModeConverter.fromAiMode(entity.getAiMode());
            if (strFromAiMode == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, strFromAiMode);
            }
            statement.mo47599bindLong(5, entity.getEnded());
            String strFromShowType = ChatVoiceMsgDao_Impl.this.__chatShowTypeConverter.fromShowType(entity.getShowType());
            if (strFromShowType == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, strFromShowType);
            }
        }
    };

    /* JADX INFO: renamed from: com.sma.smartv3.db.dao.ChatVoiceMsgDao_Impl$2 */
    public static /* synthetic */ class C185132 {
        static final /* synthetic */ int[] $SwitchMap$com$sma$smartv3$dto$FunctionType;

        static {
            int[] iArr = new int[FunctionType.values().length];
            $SwitchMap$com$sma$smartv3$dto$FunctionType = iArr;
            try {
                iArr[FunctionType.THIRD_PARTY_AI_ASSISTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ChatVoiceMsgDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ Integer OXO1(ChatVoiceMsgDao_Impl chatVoiceMsgDao_Impl, FunctionType functionType, SQLiteConnection sQLiteConnection) {
        chatVoiceMsgDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from chatvoiceassistantmessage where type =?");
        try {
            sQLiteStatementPrepare.mo47601bindText(1, chatVoiceMsgDao_Impl.__FunctionType_enumToString(functionType));
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    private String __FunctionType_enumToString(@NonNull final FunctionType _value) {
        if (C185132.$SwitchMap$com$sma$smartv3$dto$FunctionType[_value.ordinal()] == 1) {
            return "THIRD_PARTY_AI_ASSISTANT";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ List m38168iO(ChatVoiceMsgDao_Impl chatVoiceMsgDao_Impl, FunctionType functionType, SQLiteConnection sQLiteConnection) {
        chatVoiceMsgDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from chatvoiceassistantmessage where type = ?");
        try {
            sQLiteStatementPrepare.mo47601bindText(1, chatVoiceMsgDao_Impl.__FunctionType_enumToString(functionType));
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aiMode");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, C12616d4.i.f34369g0);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "showType");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ChatVoiceAssistantMessage((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), chatVoiceMsgDao_Impl.__functionTypeConverter.toFunctionType(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), chatVoiceMsgDao_Impl.__chatAiModeConverter.toAiMode(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), chatVoiceMsgDao_Impl.__chatShowTypeConverter.toShowType(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.ChatVoiceMsgDao
    public long addChatVoice(final ChatVoiceAssistantMessage item) {
        item.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOIIXI1I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f4760IO.__insertAdapterOfChatVoiceAssistantMessage.insertAndReturnId((SQLiteConnection) obj, item));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.ChatVoiceMsgDao
    public int deleteByType(final FunctionType functionType) {
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.X10O00Oi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChatVoiceMsgDao_Impl.OXO1(this.f4149IO, functionType, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.ChatVoiceMsgDao
    public List<ChatVoiceAssistantMessage> queryAllChatVoiceMessage(final FunctionType functionType) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOXX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChatVoiceMsgDao_Impl.m38168iO(this.f3343IO, functionType, (SQLiteConnection) obj);
            }
        });
    }
}
