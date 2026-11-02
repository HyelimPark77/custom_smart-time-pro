.class public final Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final cumulativeRunningLl:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final distanceLl:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final distanceNow:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nowGoalUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportGoalSet:Lcom/sma/smartv3/view/TintImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportSet:Lcom/sma/smartv3/view/TintImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sportStart:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/TintImageView;Lcom/sma/smartv3/view/TintImageView;Landroid/widget/ImageButton;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/TintImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/TintImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/ImageButton;
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
            0x0
        }
        names = {
            "rootView",
            "cumulativeRunningLl",
            "distanceLl",
            "distanceNow",
            "nowGoalUnit",
            "sportGoalSet",
            "sportSet",
            "sportStart"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->cumulativeRunningLl:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->distanceLl:Landroid/widget/RelativeLayout;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->distanceNow:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->nowGoalUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->sportGoalSet:Lcom/sma/smartv3/view/TintImageView;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->sportSet:Lcom/sma/smartv3/view/TintImageView;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->sportStart:Landroid/widget/ImageButton;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;
    .locals 11
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

    const v0, 0x7f0a02bf

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_0

    const v0, 0x7f0a031d

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/RelativeLayout;

    if-eqz v5, :cond_0

    const v0, 0x7f0a031e

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v6, :cond_0

    const v0, 0x7f0a08a2

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0a95

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/sma/smartv3/view/TintImageView;

    if-eqz v8, :cond_0

    const v0, 0x7f0a0adb

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/sma/smartv3/view/TintImageView;

    if-eqz v9, :cond_0

    const v0, 0x7f0a0add

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/ImageButton;

    if-eqz v10, :cond_0

    new-instance v2, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;-><init>(Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/TintImageView;Lcom/sma/smartv3/view/TintImageView;Landroid/widget/ImageButton;)V

    return-object v2

    :cond_0
    move-object v3, p0

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;
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

    const v0, 0x7f0d0f4f

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/databinding/LayoutGpsCommonBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
