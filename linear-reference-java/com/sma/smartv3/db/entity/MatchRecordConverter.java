package com.sma.smartv3.db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.szabh.smable3.entity.BleMatchRecordTeam3;
import com.szabh.smable3.entity.BleWeather;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MatchRecordConverter {
    public MatchRecordConverter() {
    }

    @tb1
    @TypeConverter
    public final String stopWatchListToString(@tb1 List<Integer> r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Gson().toJson(r2);
    }

    @tb1
    @TypeConverter
    public final List<Integer> stringToStopWatchList(@tb1 String r3) {
        if (TextUtils.isEmpty(r3) == true) goto L6;
        Type r0 = new MatchRecordConverter$stringToStopWatchList$listType$1().getType();
        return (List) new Gson().fromJson(r3, r0);
    L6:
        return null;
    }

    @tb1
    @TypeConverter
    public final BleMatchRecordTeam3 stringToTeamInfo(@tb1 String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return null;
    L5:
        return (BleMatchRecordTeam3) new Gson().fromJson(r3, BleMatchRecordTeam3.class);
    }

    @tb1
    @TypeConverter
    public final BleWeather stringToWeather(@tb1 String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return null;
    L5:
        return (BleWeather) new Gson().fromJson(r3, BleWeather.class);
    }

    @tb1
    @TypeConverter
    public final String teamInfoToString(@tb1 BleMatchRecordTeam3 r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Gson().toJson(r2);
    }

    @tb1
    @TypeConverter
    public final String weatherToString(@tb1 BleWeather r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Gson().toJson(r2);
    }
}
