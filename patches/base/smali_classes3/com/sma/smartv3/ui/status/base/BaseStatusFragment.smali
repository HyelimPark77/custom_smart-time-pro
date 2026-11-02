.class public abstract Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# instance fields
.field private final btnNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnPre$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dataContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final image$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final loading$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCalendar:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOffset:I

.field private final nowTimeDetails$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final scrollView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCurrent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final valueUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0iOX0O1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0iOX0O1I;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnPre$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX1X1XXXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX1X1XXXO;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnNext$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0XO1XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0XO1XO;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->tvCurrent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI1i00i1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI1i00i1;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1O0XIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1O0XIX;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->loading$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0O0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO0O0;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->dataContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXOOX1O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXOOX1O1;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowTimeDetails$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0X0;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->image$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXOOOXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXOOOXI;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->valueUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX10IXiIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX10IXiIO;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->scrollView$delegate:Lkotlin/Lazy;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->loading_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->tvCurrent_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnPre_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowTimeDetails_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnNext_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->valueUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->dataContent_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->image_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method private static final btnNext_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0893

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btnPre_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0110

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final dataContent_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02ca

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;Ljava/util/Calendar;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->showCalendarPopop$lambda$0$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;Ljava/util/Calendar;)Z

    move-result p0

    return p0
.end method

.method private static final image_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a045a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final loading_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a073a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final nowTimeDetails_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final nowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09e9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private static final showCalendarPopop$lambda$0$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;Ljava/util/Calendar;)Z
    .locals 1

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->changeTime()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final tvCurrent_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final valueUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18e8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public changeTime()V
    .locals 0

    return-void
.end method

.method public final getBtnNext()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getBtnPre()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->btnPre$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getDataContent()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->dataContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->image$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getLoading()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->loading$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getMCalendar()Ljava/util/Calendar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    return-object v0
.end method

.method public final getMCalendarPopup()Lcom/android/mltcode/paycertificationapi/X010i0ii0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    return-object v0
.end method

.method public final getMOffset()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mOffset:I

    return v0
.end method

.method public abstract getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowTimeDetails$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->nowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->scrollView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method public final getTvCurrent()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->tvCurrent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->valueUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XX0(Ljava/util/Calendar;I)V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->I1(Ljava/util/Calendar;I)V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XiOIO(Ljava/util/Calendar;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final setMCalendar(Ljava/util/Calendar;)V
    .locals 1
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    return-void
.end method

.method public final setMCalendarPopup(Lcom/android/mltcode/paycertificationapi/X010i0ii0;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/X010i0ii0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    return-void
.end method

.method public final setMOffset(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mOffset:I

    return-void
.end method

.method public share()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-scrollView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->iO(Landroidx/core/widget/NestedScrollView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final showCalendarPopop()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/X010i0ii0;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO0O10IOX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OO0O10IOX;-><init>(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/X010i0ii0;->O1O(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendarPopup:Lcom/android/mltcode/paycertificationapi/X010i0ii0;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->mCalendar:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/X010i0ii0;->iOO1ii1(Ljava/util/Calendar;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final switchLoading(Z)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getLoading()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getDataContent()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getLoading()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getDataContent()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
