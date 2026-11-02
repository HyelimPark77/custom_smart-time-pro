.class public final Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->updateItemData(Lcom/github/mikephil/charting/data/Entry;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->access$getMonthDays$p(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "monthDays"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
