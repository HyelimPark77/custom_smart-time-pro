.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    check-cast p2, Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$setMBinder$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getMBinder$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;->getDfuService()Lcom/sifli/siflidfu/ISifliDFUService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$setSifliDFUService$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;Lcom/sifli/siflidfu/ISifliDFUService;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$setBound$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " onServiceConnected"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onServiceDisconnected"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$setBound$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;Z)V

    return-void
.end method
