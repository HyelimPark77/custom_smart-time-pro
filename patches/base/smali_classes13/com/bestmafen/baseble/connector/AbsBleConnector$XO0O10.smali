.class public final Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/baseble/connector/AbsBleConnector;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;


# direct methods
.method public constructor <init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$shouldReconnect(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setConnecting(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$setMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;I)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v0

    if-ge v0, v2, :cond_1

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$setMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;I)V

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMReconnectBasePeriod()I

    move-result v1

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMReconnectMaxPeriod()I

    move-result v1

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$setMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;I)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMReconnectBasePeriod()I

    move-result v1

    mul-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMForceConnectDirectly()Z

    move-result v1

    const/16 v3, 0x20

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMConnectDirectly()Z

    move-result v1

    if-nez v1, :cond_5

    int-to-float v1, v0

    const/high16 v4, 0x3f400000    # 0.75f

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iget-object v4, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMScanMaxDuration()I

    move-result v4

    if-le v1, v4, :cond_3

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMScanMaxDuration()I

    move-result v1

    :cond_3
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v6}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " connect scan "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v6}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMScanMode()Lcom/bestmafen/baseble/scanner/ScanMode;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v6}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMScanMaxDuration()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v6}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMReconnectMaxPeriod()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v6}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMScanner$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XOO0ii0()Lcom/bestmafen/baseble/scanner/ScanMode;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XX0(Lcom/bestmafen/baseble/scanner/ScanMode;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    :cond_4
    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMHandler()Landroid/os/Handler;

    move-result-object v1

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v3, v0

    invoke-virtual {v1, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " connect directly "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$connectGatt(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v3, 0x1388

    invoke-virtual {v0, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;->IO:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMConnectDirectly()Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMConnectDirectly(Z)V

    return-void
.end method
