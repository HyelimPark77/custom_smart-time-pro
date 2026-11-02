.class public final Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;

.field public final synthetic XIi00iiXO:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;Ljava/text/SimpleDateFormat;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;->XIi00iiXO:Ljava/text/SimpleDateFormat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;->updateItemData(Lcom/github/mikephil/charting/data/Entry;)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    div-int/lit8 v0, p1, 0x3c

    div-int/lit8 v1, v0, 0x3c

    const/16 v2, 0xb

    invoke-virtual {p2, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xc

    rem-int/lit8 v0, v0, 0x3c

    invoke-virtual {p2, v1, v0}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xd

    rem-int/lit8 p1, p1, 0x3c

    invoke-virtual {p2, v0, p1}, Ljava/util/Calendar;->set(II)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/EcgDayFragment$OXO1;->XIi00iiXO:Ljava/text/SimpleDateFormat;

    invoke-static {v0, v1, p2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
