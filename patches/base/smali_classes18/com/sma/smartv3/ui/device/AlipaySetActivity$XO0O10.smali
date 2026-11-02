.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AlipaySetActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getMActiveCheckTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setMActiveCheckTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getMAutoRetryActiveTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getMActiveCheckTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AutoRetryActiveTime="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ActiveCheckTime="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->getAlipayStateFromDevice()V

    return-void
.end method
