.class public final Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final controlViewCa:Lcom/sma/smartv3/view/dial/DialElementView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final controlViewDis:Lcom/sma/smartv3/view/dial/DialElementView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final controlViewHr:Lcom/sma/smartv3/view/dial/DialElementView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final controlViewStep:Lcom/sma/smartv3/view/dial/DialElementView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final customizeDialBg:Lcom/sma/smartv3/view/ImageViewRound;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etFrameEdit:Landroid/widget/EditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivFrameAdd:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivFrameReduce:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nestedScrollView:Landroidx/core/widget/NestedScrollView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView_:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final table:Lcom/google/android/material/tabs/TabLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final timeDigitalView:Lcom/sma/smartv3/view/dial/DialElementView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final timePointView:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final timeScaleView:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvMaxCount:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final viewPager:Lcom/sma/smartv3/view/ViewPagerForScrollView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final watchfaceView:Landroidx/cardview/widget/CardView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/ImageViewRound;Landroid/widget/EditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/core/widget/NestedScrollView;Landroid/widget/LinearLayout;Lcom/google/android/material/tabs/TabLayout;Lcom/sma/smartv3/view/dial/DialElementView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/sma/smartv3/view/ViewPagerForScrollView;Landroidx/cardview/widget/CardView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/dial/DialElementView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/view/dial/DialElementView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/dial/DialElementView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/dial/DialElementView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/ImageViewRound;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/EditText;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Landroidx/core/widget/NestedScrollView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Lcom/google/android/material/tabs/TabLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Lcom/sma/smartv3/view/dial/DialElementView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Lcom/sma/smartv3/view/ViewPagerForScrollView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Landroidx/cardview/widget/CardView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView_",
            "controlViewCa",
            "controlViewDis",
            "controlViewHr",
            "controlViewStep",
            "customizeDialBg",
            "etFrameEdit",
            "ivFrameAdd",
            "ivFrameReduce",
            "nestedScrollView",
            "rootView",
            "table",
            "timeDigitalView",
            "timePointView",
            "timeScaleView",
            "tvMaxCount",
            "viewPager",
            "watchfaceView"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->rootView_:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->controlViewCa:Lcom/sma/smartv3/view/dial/DialElementView;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->controlViewDis:Lcom/sma/smartv3/view/dial/DialElementView;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->controlViewHr:Lcom/sma/smartv3/view/dial/DialElementView;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->controlViewStep:Lcom/sma/smartv3/view/dial/DialElementView;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->customizeDialBg:Lcom/sma/smartv3/view/ImageViewRound;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->etFrameEdit:Landroid/widget/EditText;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->ivFrameAdd:Landroid/widget/ImageView;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->ivFrameReduce:Landroid/widget/ImageView;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->nestedScrollView:Landroidx/core/widget/NestedScrollView;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->table:Lcom/google/android/material/tabs/TabLayout;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->timeDigitalView:Lcom/sma/smartv3/view/dial/DialElementView;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->timePointView:Landroid/widget/ImageView;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->timeScaleView:Landroid/widget/ImageView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->tvMaxCount:Landroid/widget/TextView;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->viewPager:Lcom/sma/smartv3/view/ViewPagerForScrollView;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->watchfaceView:Landroidx/cardview/widget/CardView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;
    .locals 22
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rootView"
        }
    .end annotation

    move-object/from16 v0, p0

    const v1, 0x7f0a0289

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/dial/DialElementView;

    if-eqz v5, :cond_0

    const v1, 0x7f0a028a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/sma/smartv3/view/dial/DialElementView;

    if-eqz v6, :cond_0

    const v1, 0x7f0a028b

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sma/smartv3/view/dial/DialElementView;

    if-eqz v7, :cond_0

    const v1, 0x7f0a028c

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/sma/smartv3/view/dial/DialElementView;

    if-eqz v8, :cond_0

    const v1, 0x7f0a02c6

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/sma/smartv3/view/ImageViewRound;

    if-eqz v9, :cond_0

    const v1, 0x7f0a0373

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/EditText;

    if-eqz v10, :cond_0

    const v1, 0x7f0a062d

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/ImageView;

    if-eqz v11, :cond_0

    const v1, 0x7f0a062e

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    const v1, 0x7f0a088a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroidx/core/widget/NestedScrollView;

    if-eqz v13, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const v1, 0x7f0a0b64

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/google/android/material/tabs/TabLayout;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0bb0

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/sma/smartv3/view/dial/DialElementView;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0bb1

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/ImageView;

    if-eqz v17, :cond_0

    const v1, 0x7f0a0bb2

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/ImageView;

    if-eqz v18, :cond_0

    const v1, 0x7f0a0cb7

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_0

    const v1, 0x7f0a18fd    # 1.835632E38f

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lcom/sma/smartv3/view/ViewPagerForScrollView;

    if-eqz v20, :cond_0

    const v1, 0x7f0a1916

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroidx/cardview/widget/CardView;

    if-eqz v21, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;

    move-object v14, v4

    invoke-direct/range {v3 .. v21}, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/dial/DialElementView;Lcom/sma/smartv3/view/ImageViewRound;Landroid/widget/EditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/core/widget/NestedScrollView;Landroid/widget/LinearLayout;Lcom/google/android/material/tabs/TabLayout;Lcom/sma/smartv3/view/dial/DialElementView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/sma/smartv3/view/ViewPagerForScrollView;Landroidx/cardview/widget/CardView;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "parent",
            "attachToParent"
        }
    .end annotation

    const v0, 0x7f0d013c

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityWatchfaceVideoBinding;->rootView_:Landroid/widget/LinearLayout;

    return-object v0
.end method
