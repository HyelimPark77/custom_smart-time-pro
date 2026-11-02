.class public final Lcom/sma/smartv3/ble/DfuService;
.super Lno/nordicsemi/android/dfu/DfuBaseService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/dfu/DfuBaseService;-><init>()V

    return-void
.end method


# virtual methods
.method public getNotificationTarget()Ljava/lang/Class;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/sma/smartv3/ble/DfuNotificationActivity;

    return-object v0
.end method

.method public isDebug()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
