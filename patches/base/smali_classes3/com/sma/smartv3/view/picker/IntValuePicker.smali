.class public final Lcom/sma/smartv3/view/picker/IntValuePicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/IntValuePicker$OXO1;
    }
.end annotation


# instance fields
.field public final I1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:I

.field public X1IX:Z

.field public XXX11i:I

.field public iIXi1iiXI:I

.field public iX1O1:I

.field public iXiX011:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/IntValuePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/IntValuePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    const-string p2, "0"

    iput-object p2, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X0i1O:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10b3

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a1952

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p1, 0x7f0a0ce4

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->I1:Landroid/widget/TextView;

    const/16 p2, 0x8

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 11
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/IntValuePicker;->iO()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/IntValuePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/IntValuePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iX1O1:I

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/IntValuePicker;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/picker/IntValuePicker;->IiI10X(I)V

    return-void
.end method


# virtual methods
.method public final IiI10X(I)V
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->I1:Landroid/widget/TextView;

    iget v1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iIXi1iiXI:I

    const/16 v2, 0x8

    if-eqz v1, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final O00(II)V
    .locals 4

    iput p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->XXX11i:I

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "when setUseZero is true, the min is not zero!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    sub-int/2addr p2, p1

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    :goto_1
    add-int/2addr p2, p1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_5

    iget-boolean v2, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    if-eqz v2, :cond_4

    if-nez v0, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X0i1O:Ljava/lang/String;

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v0, -0x1

    iget v3, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    iget v2, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    add-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public final XO0O10(I)I
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    iget v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    :goto_0
    add-int/2addr p1, v0

    return p1

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    goto :goto_0
.end method

.method public final XOO0ii0(I)I
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X11iII1O1:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iXiX011:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final iO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/IntValuePicker$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/IntValuePicker$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/picker/IntValuePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iXiX011:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setUnit(I)V
    .locals 2

    iput p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iIXi1iiXI:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->I1:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->I1:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->I1:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final setUseZero(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X1IX:Z

    return-void
.end method

.method public final setValuse(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iX1O1:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/picker/IntValuePicker;->IiI10X(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->iX1O1:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/picker/IntValuePicker;->XOO0ii0(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    return-void
.end method

.method public final setZeroText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker;->X0i1O:Ljava/lang/String;

    return-void
.end method
