.class public Lcom/sma/smartv3/view/chart/MyMarkerView;
.super Lcom/github/mikephil/charting/components/MarkerView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public final X11iII1O1:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "layoutResource"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/components/MarkerView;-><init>(Landroid/content/Context;I)V

    const p1, 0x7f0a0c02

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/view/chart/MyMarkerView;->X11iII1O1:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public getOffset()Lcom/android/mltcode/paycertificationapi/m00;
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/m00;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/m00;-><init>(FF)V

    return-object v0
.end method

.method public iO(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "e",
            "highlight"
        }
    .end annotation

    instance-of v0, p1, Lcom/github/mikephil/charting/data/CandleEntry;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/github/mikephil/charting/data/CandleEntry;

    iget-object v3, p0, Lcom/sma/smartv3/view/chart/MyMarkerView;->X11iII1O1:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/CandleEntry;->X0O()F

    move-result v0

    invoke-static {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/ed6;->O10IXXX0X(FIZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/chart/MyMarkerView;->X11iII1O1:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v3

    invoke-static {v3, v2, v1}, Lcom/android/mltcode/paycertificationapi/ed6;->O10IXXX0X(FIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-super {p0, p1, p2}, Lcom/github/mikephil/charting/components/MarkerView;->iO(Lcom/github/mikephil/charting/data/Entry;Lcom/android/mltcode/paycertificationapi/X110O;)V

    return-void
.end method
