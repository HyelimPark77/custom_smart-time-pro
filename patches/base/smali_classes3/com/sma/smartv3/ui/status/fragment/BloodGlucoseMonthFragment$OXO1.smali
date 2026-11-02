.class public final Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/uf1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;->updateItemData(Lcom/github/mikephil/charting/data/Entry;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;

    invoke-static {p2}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;->access$getMonthDays$p(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;)Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "monthDays"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OO(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseMonthFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public XIi00iiXO()V
    .locals 0

    return-void
.end method
