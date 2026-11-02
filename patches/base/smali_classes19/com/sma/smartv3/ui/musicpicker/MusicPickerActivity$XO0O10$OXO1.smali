.class public Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jw0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$1"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/android/mltcode/paycertificationapi/fw0;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "music"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->X1ii(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XXI(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->selectedItems:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->OIX0iXi()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->OIX0iXi()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->XXI(J)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XXI(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->loadingMode:I

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1$OXO1;-><init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->X1ii(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->I1XOi1(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XXI(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object v0

    iget v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->loadingMode:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/OXO1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I0iXXO()I

    move-result v2

    invoke-static {v0, v2}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XX0(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;I)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->O10IXXX0X(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->X0O(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;

    iget-object v0, v0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$XO0O10;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->IIX1OXO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method
