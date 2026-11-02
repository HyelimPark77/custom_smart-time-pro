.class public final Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final itemHeader:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHijriDateCorrect:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemJuristicSet:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemMethodSet:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemReminder:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemRenewal:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemTimeCorrect:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final root:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Landroid/widget/LinearLayout;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/LinearLayout;
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
            0x0
        }
        names = {
            "rootView",
            "itemHeader",
            "itemHijriDateCorrect",
            "itemJuristicSet",
            "itemMethodSet",
            "itemReminder",
            "itemRenewal",
            "itemTimeCorrect",
            "root"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemHeader:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemHijriDateCorrect:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemJuristicSet:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemMethodSet:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemReminder:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemRenewal:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->itemTimeCorrect:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->root:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;
    .locals 12
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

    const v0, 0x7f0a0594

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v4, :cond_0

    const v0, 0x7f0a05ab

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v5, :cond_0

    const v0, 0x7f0a05ad

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v6, :cond_0

    const v0, 0x7f0a05c5

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v7, :cond_0

    const v0, 0x7f0a05d2

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v8, :cond_0

    const v0, 0x7f0a05d4

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v9, :cond_0

    const v0, 0x7f0a05ed

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v10, :cond_0

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    new-instance v2, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;

    move-object v11, v3

    invoke-direct/range {v2 .. v11}, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Landroid/widget/LinearLayout;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;
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

    const v0, 0x7f0d00e6

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityQiblaSettingsBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
