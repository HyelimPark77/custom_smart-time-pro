.class public final Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0I100XX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->pointerOnClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IO0I100XX<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic OXO1(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->iO(I)V

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->XO0O10(I)V

    return-void
.end method

.method public XO0O10(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimeScaleView()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimeScaleView()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getScales()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setScaleSelectNumber(I)V

    return-void
.end method

.method public iO(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimeDigitalView()Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimePointView()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getTimePointView()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->getPointers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->setPointerSelectNumber(I)V

    return-void
.end method
