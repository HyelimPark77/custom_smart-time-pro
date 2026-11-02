.class public final Lcom/sma/smartv3/view/picker/WeightPicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/WeightPicker$OXO1;,
        Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;
    }
.end annotation


# static fields
.field public static final O001I:I = 0x1b8

.field public static final X0i1O:Lcom/sma/smartv3/view/picker/WeightPicker$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXO:I = 0x2c

.field public static final iIXi1iiXI:I = 0x96

.field public static final iXiX011:I = 0x14


# instance fields
.field public final I1:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11iII1O1:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public XXX11i:I

.field public final iX1O1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/view/picker/WeightPicker$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/view/picker/WeightPicker$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/view/picker/WeightPicker;->X0i1O:Lcom/sma/smartv3/view/picker/WeightPicker$OXO1;

    return-void
.end method

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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/WeightPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/WeightPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const/4 p2, 0x2

    .line 6
    new-array p2, p2, [I

    iput-object p2, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10b4

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a1952

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p1, 0x7f0a1953

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p1, 0x7f0a0ce4

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->iX1O1:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/WeightPicker;->iO()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/WeightPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/WeightPicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->XXX11i:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    return-object p0
.end method


# virtual methods
.method public final getMListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X1IX:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final iO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/WeightPicker$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/WeightPicker$iO;-><init>(Lcom/sma/smartv3/view/picker/WeightPicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/WeightPicker$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/WeightPicker$XO0O10;-><init>(Lcom/sma/smartv3/view/picker/WeightPicker;)V

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
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X1IX:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setUnit(I)V
    .locals 7

    iput p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->XXX11i:I

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x83

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v3, v1, :cond_1

    add-int/lit8 v2, v3, 0x14

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->iX1O1:Landroid/widget/TextView;

    const v0, 0x7f140d68

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x18d

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    if-ge v3, v1, :cond_3

    add-int/lit8 v2, v3, 0x2c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->iX1O1:Landroid/widget/TextView;

    const v0, 0x7f140dff

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    return-void
.end method

.method public final setWeight(F)V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->XXX11i:I

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/l76;->I0IIOi(FI)[I

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->XXX11i:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    aget v3, p1, v2

    add-int/lit8 v3, v3, -0x14

    aput v3, v0, v2

    aget p1, p1, v1

    aput p1, v0, v1

    goto :goto_1

    :cond_0
    aget v0, p1, v1

    const/16 v3, 0xa

    if-ne v0, v3, :cond_1

    move v3, v1

    move v0, v2

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    iget-object v4, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    aget p1, p1, v2

    add-int/lit8 p1, p1, -0x2c

    add-int/2addr p1, v3

    aput p1, v4, v2

    aput v0, v4, v1

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    aget v0, v0, v2

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/WeightPicker;->X11iII1O1:[I

    aget v0, v0, v1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    return-void
.end method
