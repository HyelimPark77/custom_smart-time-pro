.class public final Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 11

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->access$setMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    const v0, 0x989680

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->access$setMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;I)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;)I

    move-result v5

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    return-void
.end method
