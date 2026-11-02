.class public final Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->initPointsPack()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/PointsPack;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/order/PointsRechargeActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PointsPack;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->this$0:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    const v0, 0x7f0d0f00

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;Lcom/sma/smartv3/model/PointsPack;Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->convert$lambda$1(Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;Lcom/sma/smartv3/model/PointsPack;Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$1(Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;Lcom/sma/smartv3/model/PointsPack;Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V
    .locals 2

    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/PointsPack;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/PointsPack;->setSelect(Z)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/model/PointsPack;->setSelect(Z)V

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->access$setMSelectPointsPack$p(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Lcom/sma/smartv3/model/PointsPack;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PointsPack;I)V
    .locals 4

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0a13

    .line 2
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/PointsPack;->isSelect()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->this$0:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    const v2, 0x7f081635

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->this$0:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    const v2, 0x7f081632

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 6
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f0a098b

    .line 7
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PointsPack;->getRecommend()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x4

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0ce1

    .line 8
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PointsPack;->getPackName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0cdd

    .line 9
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/model/PointsPack;->getOriginalAmount()F

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uffe5"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    const v0, 0x7f0a0c35

    .line 12
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PointsPack;->getAmount()F

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget-object p3, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->this$0:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g02;

    invoke-direct {v0, p0, p2, p3}, Lcom/android/mltcode/paycertificationapi/g02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;Lcom/sma/smartv3/model/PointsPack;Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/PointsPack;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PointsPack;I)V

    return-void
.end method
