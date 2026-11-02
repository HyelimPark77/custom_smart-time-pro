.class public final Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final interpretationRecordsAudioDuration:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsAudioSeekbar:Landroid/widget/ProgressBar;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsContent:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsExtraInfo:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsLanguage:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsLocation:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsTime:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsTitle:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final interpretationRecordsToLanguage:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final simultaneousPlayAudioIcon:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final simultaneousPlayAudioVolumeIcon:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final transformLanguageImg:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final transformTitleEditImg:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ProgressBar;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ProgressBar;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Landroid/widget/ImageView;
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
            0x0
        }
        names = {
            "rootView",
            "interpretationRecordsAudioDuration",
            "interpretationRecordsAudioSeekbar",
            "interpretationRecordsContent",
            "interpretationRecordsExtraInfo",
            "interpretationRecordsLanguage",
            "interpretationRecordsLocation",
            "interpretationRecordsTime",
            "interpretationRecordsTitle",
            "interpretationRecordsToLanguage",
            "simultaneousPlayAudioIcon",
            "simultaneousPlayAudioVolumeIcon",
            "transformLanguageImg",
            "transformTitleEditImg"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsAudioDuration:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsAudioSeekbar:Landroid/widget/ProgressBar;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsContent:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsExtraInfo:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsLanguage:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsLocation:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsTime:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsTitle:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->interpretationRecordsToLanguage:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->simultaneousPlayAudioIcon:Landroid/widget/ImageView;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->simultaneousPlayAudioVolumeIcon:Landroid/widget/ImageView;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->transformLanguageImg:Landroid/widget/ImageView;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->transformTitleEditImg:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;
    .locals 18
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

    const v1, 0x7f0a0547

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v5, :cond_0

    const v1, 0x7f0a0548

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/ProgressBar;

    if-eqz v6, :cond_0

    const v1, 0x7f0a0549

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v7, :cond_0

    const v1, 0x7f0a054b

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v8, :cond_0

    const v1, 0x7f0a054c

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v9, :cond_0

    const v1, 0x7f0a054e

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v10, :cond_0

    const v1, 0x7f0a054f

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v11, :cond_0

    const v1, 0x7f0a0550

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v12, :cond_0

    const v1, 0x7f0a0551

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v13, :cond_0

    const v1, 0x7f0a0a45

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/ImageView;

    if-eqz v14, :cond_0

    const v1, 0x7f0a0a46

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/ImageView;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0bdd

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/ImageView;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0bde

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/ImageView;

    if-eqz v17, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-direct/range {v3 .. v17}, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ProgressBar;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;
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

    const v0, 0x7f0d00b9

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityInterpretationRecordsDetailBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
