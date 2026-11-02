.class public final Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageUpdateActivity2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1788#2,4:365\n1878#2,3:369\n1878#2,3:372\n1788#2,4:375\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n*L\n131#1:365,4\n154#1:369,3\n251#1:372,3\n317#1:375,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageUpdateActivity2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1788#2,4:365\n1878#2,3:369\n1878#2,3:372\n1788#2,4:375\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n*L\n131#1:365,4\n154#1:369,3\n251#1:372,3\n317#1:375,4\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLanguageUpdateProgressPopup$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStarted:Z

.field private final mTvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "LanguageUpdateActivity2"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mTvTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ak;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ak;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ck;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ck;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mLanguageUpdateProgressPopup$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/android/mltcode/paycertificationapi/qk;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mLanguageUpdateProgressPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mTvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/qk$OXO1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->initView$lambda$2(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/qk$OXO1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->refreshPage$lambda$2$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/android/mltcode/paycertificationapi/y44;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0$0$0$0$0$1(Lcom/android/mltcode/paycertificationapi/y44;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/widget/ImageButton;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0$0$2$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/widget/ImageButton;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getBtnBottom()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mLanguageUpdateProgressPopup$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/qk;

    return-object v0
.end method

.method private final getMTvTip()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mTvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getRootView()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0$0$3$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iIiiO(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/sma/smartv3/ui/device/model/LanguageUiType;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->initView$lambda$1(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/sma/smartv3/ui/device/model/LanguageUiType;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI$lambda$0$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0()Z

    move-result v0

    return v0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/sma/smartv3/ui/device/model/LanguageUiType;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->refreshPage()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/qk$OXO1;)Lkotlin/Unit;
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initView: popup = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->X1ii()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getRootView()Landroid/widget/LinearLayout;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/qk;->XiOIO(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->setMStarted(Z)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/qk;->dismiss()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->setMStarted(Z)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->OIi0()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/qk;->XXIIO1i11(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->IO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/qk;->iI(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->I0iXXO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/qk;->X11iII1O1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object p0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->XXI()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/qk;->XXX11i(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mLanguageUpdateProgressPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/android/mltcode/paycertificationapi/qk;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qk;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method private static final mTvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final refreshPage()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getBtnBottom()Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v2, v3, :cond_1

    const v2, 0x7f140de4

    goto :goto_0

    :cond_1
    const v2, 0x7f140de3

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v3, v4, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMLanguagesMaxCount()I

    move-result v4

    if-ge v3, v4, :cond_3

    move v3, v2

    goto :goto_1

    :cond_3
    const/4 v3, 0x4

    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f06074b

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    const v3, 0x7f0812c5

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/sj;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/sj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMTvTip()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v3, v4, :cond_5

    const v3, 0x7f140def

    goto :goto_2

    :cond_5
    const v3, 0x7f140ded

    :goto_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v0, v3, :cond_7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showNormalUI()V

    goto :goto_3

    :cond_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->showAddUI()V

    :goto_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getBtnBottom()Landroid/widget/Button;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x1

    if-ne v4, v3, :cond_d

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_8

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8

    move v4, v2

    goto :goto_5

    :cond_8
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :cond_9
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->IIX1OXO()Z

    move-result v6

    if-eqz v6, :cond_9

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_4

    :cond_a
    :goto_5
    if-le v4, v5, :cond_b

    move v3, v5

    goto :goto_6

    :cond_b
    move v3, v2

    :goto_6
    if-eqz v3, :cond_c

    move v1, v2

    :cond_c
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f140ddf

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const-string v1, ""

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140de0

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_7
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    if-ne v0, v5, :cond_e

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setMArg1(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->bottomClick()V

    :cond_e
    return-void
.end method

.method private static final refreshPage$lambda$2$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object p0

    sget-object p1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->ADD:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final showAddUI()V
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearItems()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showAddUI$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAddUI$lambda$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAddUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMServiceLanguageData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v3, Lcom/android/mltcode/paycertificationapi/y44;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "showAddUI: index="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",value="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->iIiiO()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->XX0()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/y44;->OiIIX101O(I)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/tj;

    invoke-direct {v2, v3, p0, p1}, Lcom/android/mltcode/paycertificationapi/tj;-><init>(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)V

    const v3, 0x7f0d0eec

    invoke-static {p1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move v2, v4

    goto :goto_0

    :cond_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAddUI$lambda$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuType(I)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuEnable(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kk;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/kk;-><init>(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lk;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/lk;-><init>(Lcom/android/mltcode/paycertificationapi/y44;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAddUI$lambda$0$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/y44;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result p4

    const/4 p5, 0x0

    const/4 v0, 0x2

    invoke-static {p3, p4, p5, v0, p5}, Lcom/szabh/smable3/entity/Languages;->codeToLanguage$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/Locale;

    move-result-object p3

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    invoke-virtual {p4, p3}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    iget-object p4, p4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p4, p3}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->OIX0iXi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/android/mltcode/paycertificationapi/y44;->I0IIOi(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    iget-object p3, p3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p3}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    move-result-object p3

    const-string p4, "getDisplayName(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/android/mltcode/paycertificationapi/y44;->OIi0(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    const p1, 0x7f0a1898

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->iO()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p1, 0x7f0a1899

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XO0O10()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p1, 0x7f0a0d15

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    const/4 p3, 0x0

    const/16 p4, 0x8

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->iIiiO()Z

    move-result p5

    if-nez p5, :cond_3

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XX0()Z

    move-result p5

    if-eqz p5, :cond_2

    goto :goto_0

    :cond_2
    move p5, p4

    goto :goto_1

    :cond_3
    :goto_0
    move p5, p3

    :goto_1
    invoke-virtual {p1, p5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->iIiiO()Z

    move-result p5

    if-eqz p5, :cond_4

    const p5, 0x7f140de9

    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(I)V

    :cond_4
    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XX0()Z

    move-result p5

    if-eqz p5, :cond_5

    const p5, 0x7f140deb

    invoke-virtual {p1, p5}, Landroid/widget/TextView;->setText(I)V

    :cond_5
    const p1, 0x7f0a0d16

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    const p1, 0x7f0a0199

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    const p1, 0x7f0a0c48

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz p1, :cond_8

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    const p1, 0x7f0a022b

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result p0

    if-eqz p0, :cond_a

    const/4 p2, 0x1

    if-eq p0, p2, :cond_9

    const p0, 0x7f080fed

    goto :goto_2

    :cond_9
    const p0, 0x7f080f6e

    goto :goto_2

    :cond_a
    const p0, 0x7f080fee

    :goto_2
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_b
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAddUI$lambda$0$0$0$0$0$1(Lcom/android/mltcode/paycertificationapi/y44;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/view/View;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result p4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p4, :cond_1

    if-eq p4, v1, :cond_0

    const p0, 0x7f140df0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    move p4, v0

    goto :goto_0

    :cond_1
    move p4, v1

    :goto_0
    invoke-virtual {p0, p4}, Lcom/android/mltcode/paycertificationapi/y44;->OiIIX101O(I)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v2 .. v7}, Lcom/angcyo/dsladapter/DslAdapter;->notifyItemChanged$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Ljava/lang/Object;ZILjava/lang/Object;)V

    invoke-direct {p3}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getBtnBottom()Landroid/widget/Button;

    move-result-object p0

    invoke-direct {p3}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMServiceLanguageData()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/y44;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result p2

    if-ne p2, v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    if-gez v0, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_1

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    const-string p1, ""

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_3
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const p2, 0x7f140de0

    invoke-virtual {p3, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showNormalUI()V
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearItems()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showNormalUI$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showNormalUI$lambda$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hk;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showNormalUI$lambda$0$0$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gk;

    invoke-direct {v1, v2, p0}, Lcom/android/mltcode/paycertificationapi/gk;-><init>(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    const v2, 0x7f0d0eec

    invoke-static {p1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move v1, v3

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuType(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ik;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ik;-><init>(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0$0(Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 7

    const-string v0, "itemHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p5, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->OXO1()Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    move-result-object p6

    invoke-static {p6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p6}, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;->getMCode()I

    move-result p6

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p5, p6, v0, v1, v0}, Lcom/szabh/smable3/entity/Languages;->codeToLanguage$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/Locale;

    move-result-object p5

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p6

    invoke-virtual {p6, p5}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p6

    iget-object p6, p6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p6, p5}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/sma/smartv3/util/UtilsKt;->OIX0iXi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p0, p5}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->I0IIOi(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p5

    iget-object p5, p5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p5}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    move-result-object p5

    const-string p6, "getDisplayName(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p5}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->OIi0(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    const p5, 0x7f0a1898

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->iO()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p5, 0x7f0a1899

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->XO0O10()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p5, 0x7f0a0d15

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p5

    check-cast p5, Lcom/sma/smartv3/view/text/PFMedium;

    const/16 p6, 0x8

    const/4 v0, 0x0

    if-eqz p5, :cond_3

    if-nez p4, :cond_2

    move v1, v0

    goto :goto_0

    :cond_2
    move v1, p6

    :goto_0
    invoke-virtual {p5, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f140dea

    invoke-virtual {p5, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_3
    const p5, 0x7f0a0d16

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p5

    check-cast p5, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz p5, :cond_4

    invoke-virtual {p5, p6}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    const p5, 0x7f0a0199

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p5

    move-object v6, p5

    check-cast v6, Landroid/widget/ImageButton;

    if-eqz v6, :cond_6

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    if-nez p4, :cond_5

    const p5, 0x7f06024d

    invoke-virtual {v6, p5}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_5
    const p5, 0x7f0601a0

    invoke-virtual {v6, p5}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/ek;

    move-object v5, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ek;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/widget/ImageButton;)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_6
    move-object v5, p1

    move-object v3, p3

    :goto_2
    const p1, 0x7f0a0c48

    invoke-virtual {v3, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz p1, :cond_8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->IIX1OXO()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p2

    if-eqz p2, :cond_7

    const p2, 0x7f140de2

    goto :goto_3

    :cond_7
    const p2, 0x7f140de1

    :goto_3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/fk;

    invoke-direct {p2, v5, p0}, Lcom/android/mltcode/paycertificationapi/fk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/iX1IIXX11;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    const p0, 0x7f0a022b

    invoke-virtual {v3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_9

    invoke-virtual {p0, p6}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_9
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0$0$2$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Landroid/widget/ImageButton;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p5, p1}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    if-nez p2, :cond_1

    const p0, 0x7f140dec

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 p5, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, p3, v1, p5, v0}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p5, 0x7f140de7

    invoke-virtual {p1, p5}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const p5, 0x7f140de6

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p5}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const p5, 0x7f14027f

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ok;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ok;-><init>()V

    invoke-virtual {p1, p5, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p5, Lcom/android/mltcode/paycertificationapi/rj;

    invoke-direct {p5, p0, p3, p2}, Lcom/android/mltcode/paycertificationapi/rj;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;I)V

    const p0, 0x7f14034b

    invoke-virtual {p1, p0, p5}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p4}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string p2, "getRootView(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;I)Z
    .locals 4

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x2

    invoke-static {v0, p0, v1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;ZILjava/lang/Object;)V

    :cond_0
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->removeDeviceLanguagesByIndex(I)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p2, 0x1

    if-eqz p0, :cond_1

    invoke-static {p0, v2, p2, v2}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_1
    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v0, v2, :cond_2

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMLanguagesMaxCount()I

    move-result p1

    if-ge v0, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    return p2
.end method

.method private static final showNormalUI$lambda$0$0$0$0$0$0$3$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;Lcom/android/mltcode/paycertificationapi/iX1IIXX11;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->updateLanguage(Ljava/util/List;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;
    .locals 1

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    const-class p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    return-object p0
.end method


# virtual methods
.method public final getMStarted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mStarted:Z

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f140de4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->refreshData$default(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/sma/smartv3/ui/device/model/LanguageUiType;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qj;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qj;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    new-instance v2, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bk;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bk;-><init>(Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;)V

    new-instance v2, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00bc

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->bottomClick()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getMLanguageUpdateProgressPopup()Lcom/android/mltcode/paycertificationapi/qk;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->ADD:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->getViewModel()Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->onHandleBackPressed()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setMStarted(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/LanguageUpdateActivity2;->mStarted:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    :cond_0
    return-void
.end method
