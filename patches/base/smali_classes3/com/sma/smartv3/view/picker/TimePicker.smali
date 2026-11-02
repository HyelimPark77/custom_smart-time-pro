.class public final Lcom/sma/smartv3/view/picker/TimePicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/TimePicker$OXO1;
    }
.end annotation


# instance fields
.field public final I1:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:I

.field public final X11iII1O1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:I

.field public XXX11i:I

.field public iIXi1iiXI:Z

.field public final iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:Lkotlin/jvm/functions/Function2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/picker/TimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/picker/TimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11iII1O1()Z

    move-result p3

    iput-boolean p3, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iIXi1iiXI:Z

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p3

    sput-boolean p3, Lcom/android/mltcode/paycertificationapi/gk4;->I0IIOi:Z

    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    const v0, 0x7f0d10af

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p3, 0x7f0a1952

    .line 7
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const-string v0, "findViewById(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p3, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p3, 0x7f0a1953

    .line 8
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p3, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p3, 0x7f0a1954

    .line 9
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p3, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p3, 0x7f0a0c00

    .line 10
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X11iII1O1:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/picker/TimePicker;->I0IIOi(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/TimePicker;->XOO0ii0()V

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

    .line 13
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/TimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/view/picker/TimePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X0i1O:I

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/view/picker/TimePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X1IX:I

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/TimePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->XXX11i:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/TimePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X1IX:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/view/picker/TimePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->XXX11i:I

    return-void
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/view/picker/TimePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X0i1O:I

    return p0
.end method


# virtual methods
.method public final I0IIOi(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/R$styleable;->WheelView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x3

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    const/4 v0, 0x2

    const v1, 0x3fa66666    # 1.3f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11iII1O1()Z

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/picker/TimePicker;->set24Hourly(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setScaleX(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setScaleX(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIi0()V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X11iII1O1:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X11iII1O1:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final IO(II)V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iIXi1iiXI:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->XXX11i:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    div-int/lit8 v1, p1, 0xc

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    rem-int/lit8 p1, p1, 0xc

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iput v1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X0i1O:I

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->XXX11i:I

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iput p2, p0, Lcom/sma/smartv3/view/picker/TimePicker;->X1IX:I

    return-void
.end method

.method public final OIi0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iIXi1iiXI:Z

    return v0
.end method

.method public final XOO0ii0()V
    .locals 9

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iIXi1iiXI:Z

    const-string v1, "format(...)"

    const-string v2, "%02d"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    const/16 v5, 0x8

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0x18

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v3

    :goto_0
    if-ge v7, v6, :cond_0

    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    goto :goto_3

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIi0()V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f140123

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x7f1410f4

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v5, Lcom/sma/smartv3/view/picker/TimePicker$XIi00iiXO;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/view/picker/TimePicker$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/picker/TimePicker;)V

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v3

    :goto_1
    if-ge v7, v6, :cond_3

    if-nez v7, :cond_2

    const-string v8, "12"

    goto :goto_2

    :cond_2
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v5, Lcom/sma/smartv3/view/picker/TimePicker$iO;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/view/picker/TimePicker$iO;-><init>(Lcom/sma/smartv3/view/picker/TimePicker;)V

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0x3c

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    if-ge v3, v6, :cond_4

    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v2, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/TimePicker$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/TimePicker$XO0O10;-><init>(Lcom/sma/smartv3/view/picker/TimePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    return-void
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iXiX011:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final set24Hourly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iIXi1iiXI:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/TimePicker;->XOO0ii0()V

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iXiX011:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    return-void
.end method
