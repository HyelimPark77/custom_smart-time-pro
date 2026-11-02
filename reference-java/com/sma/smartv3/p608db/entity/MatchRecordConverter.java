package com.sma.smartv3.p608db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.szabh.smable3.entity.BleMatchRecordTeam3;
import com.szabh.smable3.entity.BleWeather;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MatchRecordConverter {
    @tb1
    @TypeConverter
    public final String stopWatchListToString(@tb1 List<Integer> list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    @tb1
    @TypeConverter
    public final List<Integer> stringToStopWatchList(@tb1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (List) new Gson().fromJson(str, new TypeToken<List<? extends Integer>>() { // from class: com.sma.smartv3.db.entity.MatchRecordConverter$stringToStopWatchList$listType$1
        }.getType());
    }

    @tb1
    @TypeConverter
    public final BleMatchRecordTeam3 stringToTeamInfo(@tb1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (BleMatchRecordTeam3) new Gson().fromJson(str, BleMatchRecordTeam3.class);
    }

    @tb1
    @TypeConverter
    public final BleWeather stringToWeather(@tb1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (BleWeather) new Gson().fromJson(str, BleWeather.class);
    }

    @tb1
    @TypeConverter
    public final String teamInfoToString(@tb1 BleMatchRecordTeam3 bleMatchRecordTeam3) {
        if (bleMatchRecordTeam3 != null) {
            return new Gson().toJson(bleMatchRecordTeam3);
        }
        return null;
    }

    @tb1
    @TypeConverter
    public final String weatherToString(@tb1 BleWeather bleWeather) {
        if (bleWeather != null) {
            return new Gson().toJson(bleWeather);
        }
        return null;
    }
}
