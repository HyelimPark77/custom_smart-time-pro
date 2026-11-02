package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TeraBoxTokenInfo {

    @aa1
    private final String client_id;

    @aa1
    private final String user_id;

    /* JADX WARN: Multi-variable type inference failed */
    public TeraBoxTokenInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TeraBoxTokenInfo copy$default(TeraBoxTokenInfo teraBoxTokenInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teraBoxTokenInfo.client_id;
        }
        if ((i & 2) != 0) {
            str2 = teraBoxTokenInfo.user_id;
        }
        return teraBoxTokenInfo.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.client_id;
    }

    @aa1
    public final String component2() {
        return this.user_id;
    }

    @aa1
    public final TeraBoxTokenInfo copy(@aa1 String client_id, @aa1 String user_id) {
        Intrinsics.X0O(client_id, "client_id");
        Intrinsics.X0O(user_id, "user_id");
        return new TeraBoxTokenInfo(client_id, user_id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeraBoxTokenInfo)) {
            return false;
        }
        TeraBoxTokenInfo teraBoxTokenInfo = (TeraBoxTokenInfo) obj;
        return Intrinsics.XOO0ii0(this.client_id, teraBoxTokenInfo.client_id) && Intrinsics.XOO0ii0(this.user_id, teraBoxTokenInfo.user_id);
    }

    @aa1
    public final String getClient_id() {
        return this.client_id;
    }

    @aa1
    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return (this.client_id.hashCode() * 31) + this.user_id.hashCode();
    }

    @aa1
    public String toString() {
        return "TeraBoxTokenInfo(client_id=" + this.client_id + ", user_id=" + this.user_id + I000IiI1O.C2156iO.f1007iO;
    }

    public TeraBoxTokenInfo(@aa1 String client_id, @aa1 String user_id) {
        Intrinsics.X0O(client_id, "client_id");
        Intrinsics.X0O(user_id, "user_id");
        this.client_id = client_id;
        this.user_id = user_id;
    }

    public /* synthetic */ TeraBoxTokenInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
