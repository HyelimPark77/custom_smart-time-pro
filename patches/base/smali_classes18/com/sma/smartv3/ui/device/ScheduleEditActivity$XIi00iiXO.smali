.class public final Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;
.super Lcom/android/mltcode/paycertificationapi/O0iXOO;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;->I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;

    const/16 p1, 0xfa

    invoke-direct {p0, p1}, Lcom/android/mltcode/paycertificationapi/O0iXOO;-><init>(I)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/android/mltcode/paycertificationapi/O0iXOO;->afterTextChanged(Landroid/text/Editable;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;->I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->access$setEdited$p(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;->I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->access$getMSchedule$p(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Lcom/szabh/smable3/entity/BleSchedule;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mSchedule"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, ""

    :cond_2
    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSchedule;->setMContent(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;->I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->access$getEdtTip(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ScheduleEditActivity$XIi00iiXO;->I1:Lcom/sma/smartv3/ui/device/ScheduleEditActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ScheduleEditActivity;->access$getEdtTip(Lcom/sma/smartv3/ui/device/ScheduleEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
