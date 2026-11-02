.class public final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final adapter:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final audioPlayer$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private currentSessionId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d16;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d16;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->audioPlayer$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;-><init>()V

    new-instance v1, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->setPlayListener(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->adapter:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e16;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e16;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->viewModel$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->currentSessionId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->showDeletePop$lambda$0$1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->showDeletePop$lambda$0$2(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->audioPlayer_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->initView$lambda$3$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->showDeletePop$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$getAdapter$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->adapter:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    return-object p0
.end method

.method public static final synthetic access$getAudioPlayer(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getAudioPlayer()Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    move-result-object p0

    return-object p0
.end method

.method private static final audioPlayer_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-object v0
.end method

.method private final getAudioPlayer()Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->audioPlayer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    return-object v0
.end method

.method private final getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object v0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->currentSessionId:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;->getAllSessionEntity(Ljava/lang/String;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final initView$lambda$3$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->showDeletePop()V

    return-void
.end method

.method private final showDeletePop()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p0, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f141348

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const-string v2, "\u662f\u5426\u5220\u9664\u6240\u6709\u8bb0\u5f55"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iOO1ii1(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v2, 0x7f14027f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/a16;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/a16;-><init>()V

    invoke-virtual {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/b16;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/b16;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    const v3, 0x7f14034b

    invoke-virtual {v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/c16;

    invoke-direct {v2, p0, v1, v0}, Lcom/android/mltcode/paycertificationapi/c16;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final showDeletePop$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeletePop$lambda$0$1(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Z
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;->deleteSession()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->adapter:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->clear()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final showDeletePop$lambda$0$2(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;
    .locals 1

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    const-class p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 14

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->currentSessionId:Ljava/lang/String;

    const v0, 0x7f0a009d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/x06;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/x06;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    const v1, 0x7f0a009c

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->adapter:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    const v1, 0x7f0a0024

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/y06;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/y06;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0023

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f140d2a

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a0026

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f080ffe

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/z06;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/z06;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;->getResultFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;

    const/4 v1, 0x0

    invoke-direct {v5, p0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;->getStateFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v9

    new-instance v11, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$6;

    invoke-direct {v11, v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$6;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v8 .. v13}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    move-object v2, v8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;

    move-result-object v0

    iget-object v1, v2, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->currentSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailViewModel;->getAllSessionEntity(Ljava/lang/String;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0132

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->getAudioPlayer()Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->stop()V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    return-void
.end method
