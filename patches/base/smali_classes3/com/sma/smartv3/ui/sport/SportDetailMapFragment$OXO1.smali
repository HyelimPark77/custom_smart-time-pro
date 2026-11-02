.class public final Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/util/ArrayList;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;F)V"
        }
    .end annotation

    const-string p2, "points"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addGoogleLine(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public XIi00iiXO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->access$getBtnMapHot(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->access$getBtnMapMark(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMLineColors()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addLine()V

    return-void
.end method

.method public XO0O10(Ljava/util/ArrayList;FI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;FI)V"
        }
    .end annotation

    const-string p2, "points"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x1

    if-le p2, p3, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addBaiduLine(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public iO(F)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->access$getBtnMapHot(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->access$getBtnMapMark(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
