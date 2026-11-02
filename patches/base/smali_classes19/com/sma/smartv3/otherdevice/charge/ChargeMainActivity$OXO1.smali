.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$OXO1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->autoSyncData(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getRefreshLayout(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$syncInfo(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V

    :cond_0
    return-void
.end method
