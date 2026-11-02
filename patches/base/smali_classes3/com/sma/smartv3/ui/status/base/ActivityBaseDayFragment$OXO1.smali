.class public final Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

.field public final synthetic XIi00iiXO:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;Ljava/text/SimpleDateFormat;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->XIi00iiXO:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V
    .locals 5

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->updateItemData(Lcom/github/mikephil/charting/data/Entry;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object p2

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    const/16 v0, 0xb

    invoke-virtual {p2, v0, p1}, Ljava/util/Calendar;->set(II)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->XIi00iiXO:Ljava/text/SimpleDateFormat;

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const v3, 0x36ee80

    int-to-long v3, v3

    add-long/2addr v1, v3

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;->XIi00iiXO:Ljava/text/SimpleDateFormat;

    invoke-static {v1, v2, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f141342

    invoke-virtual {p2, v1, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
