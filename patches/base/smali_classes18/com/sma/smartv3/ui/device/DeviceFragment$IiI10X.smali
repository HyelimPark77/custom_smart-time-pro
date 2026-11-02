.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$IiI10X;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;->conntectDevice(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3159#2,2:149\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3159#2,2:149\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    return-void
.end method
