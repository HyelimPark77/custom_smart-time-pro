.class public Lcom/jieli/jl_bt_ota/constant/GattError;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final GATT_CONN_CANCEL:I = 0x100

.field public static final GATT_CONN_FAIL_ESTABLISH:I = 0x3e

.field public static final GATT_CONN_L2C_FAILURE:I = 0x1

.field public static final GATT_CONN_LMP_TIMEOUT:I = 0x22

.field public static final GATT_CONN_TERMINATE_LOCAL_HOST:I = 0x16

.field public static final GATT_CONN_TERMINATE_PEER_USER:I = 0x13

.field public static final GATT_CONN_TIMEOUT:I = 0x8

.field public static final GATT_ERROR:I = 0x85

.field public static final GATT_SUCCESS:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseConnectionError(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_8

    const/4 v0, 0x1

    if-eq p0, v0, :cond_7

    const/16 v0, 0x8

    if-eq p0, v0, :cond_6

    const/16 v0, 0x13

    if-eq p0, v0, :cond_5

    const/16 v0, 0x16

    if-eq p0, v0, :cond_4

    const/16 v0, 0x22

    if-eq p0, v0, :cond_3

    const/16 v0, 0x3e

    if-eq p0, v0, :cond_2

    const/16 v0, 0x85

    if-eq p0, v0, :cond_1

    const/16 v0, 0x100

    if-eq p0, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "GATT CONN CANCEL "

    return-object p0

    :cond_1
    const-string p0, "GATT ERROR"

    return-object p0

    :cond_2
    const-string p0, "GATT CONN FAIL ESTABLISH"

    return-object p0

    :cond_3
    const-string p0, "GATT CONN LMP TIMEOUT"

    return-object p0

    :cond_4
    const-string p0, "GATT CONN TERMINATE LOCAL HOST"

    return-object p0

    :cond_5
    const-string p0, "GATT CONN TERMINATE PEER USER"

    return-object p0

    :cond_6
    const-string p0, "GATT CONN TIMEOUT"

    return-object p0

    :cond_7
    const-string p0, "GATT CONN L2C FAILURE"

    return-object p0

    :cond_8
    const-string p0, "SUCCESS"

    return-object p0
.end method
