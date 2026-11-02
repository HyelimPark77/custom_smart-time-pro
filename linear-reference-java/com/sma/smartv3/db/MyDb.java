package com.sma.smartv3.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import com.android.mltcode.paycertificationapi.aa1;
import com.ironsource.C2985d4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MyDb {

    @aa1
    public static final MyDb INSTANCE = null;
    public static AppDatabase mDatabase;

    static {
        INSTANCE = new MyDb();
    }

    private MyDb() {
    }

    @aa1
    public final AppDatabase getMDatabase() {
        AppDatabase r0 = mDatabase;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mDatabase");
        return null;
    }

    public final void init(@aa1 Context r58) {
        Intrinsics.X0O(r58, "context");
        setMDatabase((AppDatabase) Room.databaseBuilder(r58, AppDatabase.class, "db[" + r58.getPackageName() + C2985d4.j.e).addMigrations(new Migration[]{new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4(), new AnonymousClass5(), new AnonymousClass6(), new AnonymousClass7(), new AnonymousClass8(), new AnonymousClass9(), new AnonymousClass10(), new AnonymousClass11(), new AnonymousClass12(), new AnonymousClass13(), new AnonymousClass14(), new AnonymousClass15(), new AnonymousClass16(), new AnonymousClass17(), new AnonymousClass18(), new AnonymousClass19(), new AnonymousClass20(), new AnonymousClass21(), new AnonymousClass22(), new AnonymousClass23(), new AnonymousClass24(), new AnonymousClass25(), new AnonymousClass26(), new AnonymousClass27(), new AnonymousClass28(), new AnonymousClass29(), new AnonymousClass30(), new AnonymousClass31(), new AnonymousClass32(), new AnonymousClass33(), new AnonymousClass34(), new AnonymousClass35(), new AnonymousClass36(), new AnonymousClass37(), new AnonymousClass38(), new AnonymousClass39(), new AnonymousClass40(), new AnonymousClass41(), new AnonymousClass42(), new AnonymousClass43(), new AnonymousClass44(), new AnonymousClass45(), new AnonymousClass46(), new AnonymousClass47(), new AnonymousClass48(), new AnonymousClass49(), new AnonymousClass50(), new AnonymousClass51(), new AnonymousClass52(), new AnonymousClass53(), new AnonymousClass54(), new AnonymousClass55()}).allowMainThreadQueries().build());
    }

    public final void setMDatabase(@aa1 AppDatabase r2) {
        Intrinsics.X0O(r2, "<set-?>");
        mDatabase = r2;
    }
}
