.class public final Lcom/sma/smartv3/view/picker/CalibrationPicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/CalibrationPicker$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCalibrationPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalibrationPicker.kt\ncom/sma/smartv3/view/picker/CalibrationPicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCalibrationPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalibrationPicker.kt\ncom/sma/smartv3/view/picker/CalibrationPicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
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

.field public X11iII1O1:I

.field public X1IX:Lkotlin/jvm/functions/Function2;
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

.field public XXX11i:I

.field public iX1O1:I


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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/CalibrationPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/CalibrationPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const/16 p2, 0x41

    .line 6
    iput p2, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10b2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a1952

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    const p1, 0x7f0a1953

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 10
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IiI10X()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/CalibrationPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/view/picker/CalibrationPicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->iX1O1:I

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/CalibrationPicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->X11iII1O1:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/CalibrationPicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->iX1O1:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/view/picker/CalibrationPicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->X11iII1O1:I

    return-void
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/view/picker/CalibrationPicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    return p0
.end method


# virtual methods
.method public final IiI10X()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x82

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    iget v5, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    add-int/2addr v5, v4

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/CalibrationPicker$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/CalibrationPicker$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/picker/CalibrationPicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v3, v2, :cond_1

    iget v4, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    add-int/2addr v4, v3

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/CalibrationPicker$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/CalibrationPicker$iO;-><init>(Lcom/sma/smartv3/view/picker/CalibrationPicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    return-void
.end method

.method public final XOO0ii0(II)V
    .locals 2

    iput p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->iX1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->X11iII1O1:I

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->XXX11i:I

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

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

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->X1IX:Lkotlin/jvm/functions/Function2;

    return-object v0
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

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->X1IX:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/CalibrationPicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    return-void
.end method
