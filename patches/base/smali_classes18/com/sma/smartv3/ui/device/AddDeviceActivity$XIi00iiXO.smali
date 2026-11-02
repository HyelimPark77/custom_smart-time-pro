.class public final Lcom/sma/smartv3/ui/device/AddDeviceActivity$XIi00iiXO;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AddDeviceActivity;->bindDone()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceActivity\n*L\n1#1,148:1\n232#2,3:149\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 AddDeviceActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceActivity\n*L\n1#1,148:1\n232#2,3:149\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/AddDeviceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AddDeviceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "code_pair_change"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
