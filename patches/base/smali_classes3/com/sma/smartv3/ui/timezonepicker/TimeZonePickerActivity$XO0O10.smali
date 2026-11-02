.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->loadData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public doInBackground()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {v0, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OiIIX101O(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Landroid/content/Context;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->X1ii(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "result"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->X1ii(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->IIX1OXO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XXI(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->loadingMode:I

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XXI()I

    move-result v2

    invoke-static {p1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XiOIii1(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;I)V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->O10IXXX0X(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->X0O(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->I1XOi1(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XiOIO(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method
