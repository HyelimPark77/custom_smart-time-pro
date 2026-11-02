.class public final Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/szabh/smable3/entity/BleMedicationAlarm;)Z
    .locals 2
    .param p1    # Lcom/szabh/smable3/entity/BleMedicationAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "alarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;->XIi00iiXO(Lcom/szabh/smable3/entity/BleMedicationAlarm;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->setMYear(I)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIX0iXi(Ljava/util/Calendar;)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->setMMonth(I)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->setMDay(I)V

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final XIi00iiXO(Lcom/szabh/smable3/entity/BleMedicationAlarm;)Z
    .locals 4
    .param p1    # Lcom/szabh/smable3/entity/BleMedicationAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "alarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMYear()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMMonth()I

    move-result v2

    sub-int/2addr v2, v3

    const/4 v3, 0x2

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v2, 0x5

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMDay()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xb

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMHour()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xc

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMMinute()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
