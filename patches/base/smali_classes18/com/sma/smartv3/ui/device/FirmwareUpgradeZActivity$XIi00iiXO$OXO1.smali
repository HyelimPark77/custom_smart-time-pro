.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;->onBluetoothReady()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$mBluetoothEventListener$1\n*L\n1#1,148:1\n53#2,4:149\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$mBluetoothEventListener$1\n*L\n1#1,148:1\n53#2,4:149\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->access$getMBluetoothManager$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/bluetrum/abota/bluetooth/BleManager;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/bluetrum/abota/bluetooth/BleManager;->isReady()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->access$getMAbOta$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/bluetrum/fota/abota/ABOta;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bluetrum/fota/abota/ABOta;->isUpdating()Z

    move-result v0

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->startOTA(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
