.class public final Lcom/sma/smartv3/ui/device/QiblaTimeActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/FutureCalendarView$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDateSelected(Ljava/util/Calendar;III)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;

    invoke-static {p3, p1, p2}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->access$showPrayerTime(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;J)V

    :cond_0
    return-void
.end method
