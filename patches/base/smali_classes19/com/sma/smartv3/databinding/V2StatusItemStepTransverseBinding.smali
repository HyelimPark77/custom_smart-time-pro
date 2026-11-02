.class public final Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final distanceUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivRight:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivWeather:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llCalories:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llDistance:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llGoalSet:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llSteps:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rlTipContent:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final stepPB:Lcom/sma/smartv3/view/Goal2ProgressBar;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tabSwitchImg:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final transverseGoal:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvCalorie:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvDistance:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvStep:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTemperature:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherTime:Lcom/sma/smartv3/view/text/MHFont;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/Goal2ProgressBar;Landroid/widget/ImageView;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/MarqueeTextView;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/Goal2ProgressBar;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Lcom/sma/smartv3/view/text/MHFont;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Lcom/sma/smartv3/view/text/MHFont;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Lcom/sma/smartv3/view/text/MHFont;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Lcom/sma/smartv3/view/MarqueeTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Lcom/sma/smartv3/view/text/MHFont;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Lcom/sma/smartv3/view/text/MHFont;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Lcom/sma/smartv3/view/text/MHFont;
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
            "rootView",
            "distanceUnit",
            "ivRight",
            "ivWeather",
            "llCalories",
            "llDistance",
            "llGoalSet",
            "llSteps",
            "rlTipContent",
            "stepPB",
            "tabSwitchImg",
            "transverseGoal",
            "tvCalorie",
            "tvDistance",
            "tvMarquee",
            "tvStep",
            "tvTemperature",
            "tvWeatherTime"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->distanceUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->ivRight:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->ivWeather:Landroid/widget/ImageView;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->llCalories:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->llDistance:Landroid/widget/LinearLayout;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->llGoalSet:Landroid/widget/RelativeLayout;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->llSteps:Landroid/widget/LinearLayout;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->rlTipContent:Landroid/widget/RelativeLayout;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->stepPB:Lcom/sma/smartv3/view/Goal2ProgressBar;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tabSwitchImg:Landroid/widget/ImageView;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->transverseGoal:Lcom/sma/smartv3/view/text/MHFont;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvCalorie:Lcom/sma/smartv3/view/text/MHFont;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvDistance:Lcom/sma/smartv3/view/text/MHFont;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvStep:Lcom/sma/smartv3/view/text/MHFont;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvTemperature:Lcom/sma/smartv3/view/text/MHFont;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->tvWeatherTime:Lcom/sma/smartv3/view/text/MHFont;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;
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

    const v1, 0x7f0a031f

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v5, :cond_0

    const v1, 0x7f0a0667

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    const v1, 0x7f0a060a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    const v1, 0x7f0a06b7

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/LinearLayout;

    if-eqz v8, :cond_0

    const v1, 0x7f0a06ba

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/LinearLayout;

    if-eqz v9, :cond_0

    const v1, 0x7f0a06ef

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/RelativeLayout;

    if-eqz v10, :cond_0

    const v1, 0x7f0a06c6

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/LinearLayout;

    if-eqz v11, :cond_0

    const v1, 0x7f0a09a9

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/RelativeLayout;

    if-eqz v12, :cond_0

    const v1, 0x7f0a0b36

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/sma/smartv3/view/Goal2ProgressBar;

    if-eqz v13, :cond_0

    const v1, 0x7f0a0b63

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/ImageView;

    if-eqz v14, :cond_0

    const v1, 0x7f0a0bf2

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0bfd

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0c05

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v17, :cond_0

    const v1, 0x7f0a0cb4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/sma/smartv3/view/MarqueeTextView;

    if-eqz v18, :cond_0

    const v1, 0x7f0a0c14

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v19, :cond_0

    const v1, 0x7f0a0c15

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v20, :cond_0

    const v1, 0x7f0a0c19

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/sma/smartv3/view/text/MHFont;

    if-eqz v21, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-direct/range {v3 .. v21}, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/Goal2ProgressBar;Landroid/widget/ImageView;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/MarqueeTextView;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;Lcom/sma/smartv3/view/text/MHFont;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;
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

    const v0, 0x7f0d10a4

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/V2StatusItemStepTransverseBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
