.class public final Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I0IIOi:Landroid/widget/TextView;

.field public final synthetic IO:Landroid/widget/TextView;

.field public final synthetic IiI10X:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic O00:Landroid/widget/TextView;

.field public final synthetic OIi0:Landroid/widget/TextView;

.field public final synthetic OXO1:[Ljava/lang/String;

.field public final synthetic XIi00iiXO:Landroid/widget/TextView;

.field public final synthetic XO0O10:Lcom/github/mikephil/charting/charts/LineChart;

.field public final synthetic XOO0ii0:Lcom/sma/smartv3/db/entity/Workout;

.field public final synthetic iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;


# direct methods
.method public constructor <init>([Ljava/lang/String;Landroid/widget/TextView;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/TextView;Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/db/entity/Workout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->OXO1:[Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XIi00iiXO:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    iput-object p4, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XO0O10:Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p5, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->O00:Landroid/widget/TextView;

    iput-object p6, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->IiI10X:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p7, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XOO0ii0:Lcom/sma/smartv3/db/entity/Workout;

    iput-object p8, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->I0IIOi:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->OIi0:Landroid/widget/TextView;

    iput-object p10, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->IO:Landroid/widget/TextView;

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

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p2

    float-to-int p2, p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->OXO1:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x1

    if-le p2, v1, :cond_0

    array-length p2, v0

    sub-int/2addr p2, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p2

    float-to-int p2, p2

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XIi00iiXO:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->OXO1:[Ljava/lang/String;

    aget-object p2, v3, p2

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->formatMonthDay(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XO0O10:Lcom/github/mikephil/charting/charts/LineChart;

    invoke-virtual {p2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/android/mltcode/paycertificationapi/co;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    const/high16 v3, 0x7fc00000    # Float.NaN

    invoke-virtual {v0, p1, v3}, Lcom/github/mikephil/charting/data/DataSet;->iI0I(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {p2, v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p2, p1, v3}, Lcom/github/mikephil/charting/data/DataSet;->iI0I(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v1

    sub-float/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->O00:Landroid/widget/TextView;

    const-string v3, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->IiI10X:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_3

    move-object p1, v3

    move-object p2, p1

    goto/16 :goto_1

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->XOO0ii0:Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v0

    float-to-double v0, v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XXiIiX10(DI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-double v0, p1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/cp5;->XXiIiX10(DI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    float-to-double v0, p2

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p2

    invoke-static {v0, v1, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->XXiIiX10(DI)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-int p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    float-to-int p2, p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-int p1, p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p1

    float-to-int p2, p2

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p2

    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->I0IIOi:Landroid/widget/TextView;

    const-string v1, ":"

    if-eqz v0, :cond_6

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    const v4, 0x7f140c5d

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->OIi0:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    const v3, 0x7f14006f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->IO:Landroid/widget/TextView;

    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;->iO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    const v2, 0x7f140463

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
