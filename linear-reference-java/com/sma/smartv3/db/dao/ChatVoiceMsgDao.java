package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.dto.FunctionType;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface ChatVoiceMsgDao {
    @Insert
    long addChatVoice(@aa1 ChatVoiceAssistantMessage r1);

    @Query("delete from chatvoiceassistantmessage where type =:functionType")
    int deleteByType(@aa1 FunctionType r1);

    @Query("select * from chatvoiceassistantmessage where type = :functionType")
    @aa1
    List<ChatVoiceAssistantMessage> queryAllChatVoiceMessage(@aa1 FunctionType r1);
}
